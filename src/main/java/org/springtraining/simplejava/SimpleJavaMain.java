package org.springtraining.simplejava;

import java.io.IOException;
import java.util.Properties;

public class SimpleJavaMain {
    public static void main(String[] args)  throws IOException {
        Properties properties = new Properties();
        properties.load(SimpleJavaMain.class.getResourceAsStream("/messaging.properties"));

        String type = properties.getProperty("messaging.type");
        System.out.println(type);

        for (int i=0;i<3;i++){
            MessagingService service = null;
            if (type.equals("JMS")){
                service = JmsMessagingService.getInstance();
                service.sendMessages("test");
            } else if (type .equals("KAFKA")) {
                service = new KafkaMessagingService();
                service.sendMessages("test1");
            }
            System.out.println(service);
            System.out.println(service.hashCode());
        }
    }
}
