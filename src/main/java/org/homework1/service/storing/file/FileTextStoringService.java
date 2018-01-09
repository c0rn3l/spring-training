package org.homework1.service.storing.file;

import org.homework1.Message;

public class FileTextStoringService extends FileStoringService{

    public void storeMessage(Message message) {
        System.out.println("stored in File: " + message);
    }
}
