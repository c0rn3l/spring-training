package org.homework1;

import org.homework1.service.MessageStoringService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(StoringConfiguration.class);
        MessageStoringService builder = context.getBean(MessageStoringService.class);
        builder.createMessages(args[0]);
    }
}
