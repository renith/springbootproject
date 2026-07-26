package com.example.springsecurityjwt.springsecurityjwt;

import com.example.springsecurityjwt.springsecurityjwt.model.AuthenticationRequest;
import com.example.springsecurityjwt.springsecurityjwt.model.AuthenticationResponse;
import com.example.springsecurityjwt.springsecurityjwt.services.MyUserDetailsService;
import com.example.springsecurityjwt.springsecurityjwt.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloResource {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @GetMapping({"/validateToken"})
    public ResponseEntity<?> validateToken(final HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse){
        final Map<String,Boolean> responseMap = new HashMap<>();
        responseMap.put("response",Boolean.TRUE);

        return new ResponseEntity<>(responseMap, HttpStatus.OK) ;
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthentication(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUserName(), authenticationRequest.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password", e);

        }
  final UserDetails userDetails = userDetailsService
          .loadUserByUsername(authenticationRequest.getUserName());
        final String jwt = jwtTokenUtil.generateToken(userDetails);
        return  ResponseEntity.ok(new AuthenticationResponse(jwt));
    }

}
