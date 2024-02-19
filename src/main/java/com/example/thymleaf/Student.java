package com.example.thymleaf;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Student {

    private String uuid;
    private String name;
    private String surname;
    private String grade;
}
