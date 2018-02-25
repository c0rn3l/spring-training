package org.homework1.service.storing.memory;

import org.homework1.Message;

public class InMemoryTextStoringService extends InMemoryStoringService {

    public void storeMessage(Message message) {
        System.out.println("stored in Memory: " + message);
    }
}
