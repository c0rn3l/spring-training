package org.homework1.service.storing.memory;

import org.homework1.Message;
import org.homework1.service.storing.StoreService;

public abstract class InMemoryStoringService implements StoreService {
    public abstract void storeMessage(Message message);
}