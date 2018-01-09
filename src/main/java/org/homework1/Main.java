package org.homework1;

import org.homework1.service.MessageBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(StoringConfiguration.class);
        MessageBuilder builder = context.getBean(MessageBuilder.class);
        builder.createMessages(args[0]);
    }
}
