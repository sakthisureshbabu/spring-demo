package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            MessageService service = context.getBean("messageService", MessageService.class);
        
            service.displayMessage();
        }
    }
}
