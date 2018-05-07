package ro.ubb.lab7.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.ubb.lab7.core.ui.Console;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext("ro.ubb.lab7.core.config");

        Console console=context.getBean(Console.class);
        console.runConsole();

        System.out.println("bye");
    }
}
