package com.github.estorsk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//        Задача 2: Создаем таск.
//        Нужно создать АПИ, в которое принимает
//        на вход «таск» и сохраняет его в static массив.


@SpringBootApplication
public class RestApplication {
    public static void main(String[] args){
        SpringApplication.run(RestApplication.class, args);

    }
}
