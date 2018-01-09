package org.homework1.service.builder;

import org.homework1.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class InjectionBuilder implements MessageBuilder {

    @Autowired
    private ApplicationContext applicationContext;

    public Message newInstance() {
        System.out.println("Injected new message instance");
        return applicationContext.getBean(Message.class);
    }
}
