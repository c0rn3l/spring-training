package org.homework1.service.storing.file;

import org.homework1.Message;
import org.homework1.service.storing.StoreService;

public abstract class FileStoringService implements StoreService {
    public abstract void storeMessage(Message message);
}
