package com.example.LoadBalancedMainApp;

import com.netflix.client.IClient;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RibbonConfiguration {

    @Autowired
    IClientConfig ribbonClient;

    @Bean
    public IPing ping(IClientConfig ribbonClient){
        return new PingUrl();

        //Checks whether a server is alive by calling a URL endpoint.
    }

    @Bean
    public IRule rule(IClientConfig ribbonClient){
        return new AvailabilityFilteringRule();


     /*   Ribbon selects servers based on:

        Server availability
        Active connections
        Circuit breaker status

        It avoids overloaded or failed servers.*/
    }
}
