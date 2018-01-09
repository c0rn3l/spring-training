package org.homework1.service.builder;

import org.homework1.Message;

public class ConstructorBuilder implements MessageBuilder {

    public Message newInstance() {
        System.out.println("Constructed new message instance");
        return new Message();
    }
}
