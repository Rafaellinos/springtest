package com.example.utils;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PrintSomething {

    public PrintSomething() {
        System.out.println("inicializing " + getClass().getName());
    }

    public void pprintSomething(String something) {
        if (something == null) {
            something = "nada";
        }
        System.out.println(something);
    }
}
