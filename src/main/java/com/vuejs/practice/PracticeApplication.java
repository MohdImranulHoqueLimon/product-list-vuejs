package com.vuejs.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeApplication.class, args);

        System.out.println("Salary = " + 50 * 10);
        System.out.println(50 + 10 + " = Salary");
    }

}
