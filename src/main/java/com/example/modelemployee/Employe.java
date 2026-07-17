package com.example.modelemployee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public  class Employe {

    String name;
    int age;
    String skill;
    String location;

}

