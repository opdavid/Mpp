package ro.ubb.lab7.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.client.RestTemplate;
import ro.ubb.lab7.client.ui.Console;


public class ClientApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("ro.ubb.lab7.client.config");
        RestTemplate restTemplate = context.getBean(RestTemplate.class);

        Console console = context.getBean(Console.class);

        console.runConsole();



        System.out.println("bye ");
    }
}
