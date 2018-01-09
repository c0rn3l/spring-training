package org.homework1.service;

import org.homework1.Message;

import java.util.List;

public class InMemoryStoringService implements StoringService{

    public void storeMessage(Message message) {
        System.out.println("stored in Memory: " + message);
    }
}
