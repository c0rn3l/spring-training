package org.homework1.service;

import org.homework1.Message;

public class FileStoringService implements StoringService{

    public void storeMessage(Message message) {
        System.out.println("stored in File: " + message);
    }
}
