package org.homework1;

import org.homework1.service.FileStoringService;
import org.homework1.service.InMemoryStoringService;
import org.homework1.service.StoringService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class StoringConfiguration {

    @Bean
    public StoringService storingService(StoringProperties properties) {
        switch (properties.getStoreType()) {
            case FILE:
                return new FileStoringService();
            case IN_MEMORY:
                return new InMemoryStoringService();
            default:
                throw new UnsupportedOperationException("Storing type not supported: " + properties.getStoreType());
        }
    }

}
