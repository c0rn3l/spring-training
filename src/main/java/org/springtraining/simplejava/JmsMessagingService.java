package org.springtraining.simplejava;

import org.springtraining.simplejava.MessagingService;

public class JmsMessagingService implements MessagingService {

    private static JmsMessagingService INSTANCE = null;

    private JmsMessagingService(){

    }

    public static JmsMessagingService getInstance() {
        if (INSTANCE == null)
            INSTANCE = new JmsMessagingService();
        return INSTANCE;
    }

    public void sendMessages(String messages) {
        System.out.println("JMG msg: "+messages);
    }
}
