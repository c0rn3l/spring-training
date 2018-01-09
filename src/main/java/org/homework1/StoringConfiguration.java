package org.homework1;

import org.homework1.service.builder.ConstructorBuilder;
import org.homework1.service.builder.InjectionBuilder;
import org.homework1.service.builder.MessageBuilder;
import org.homework1.service.storing.file.FileHashStoringService;
import org.homework1.service.storing.file.FileTextStoringService;
import org.homework1.service.storing.memory.InMemoryHashStoringService;
import org.homework1.service.storing.StoreService;
import org.homework1.service.storing.memory.InMemoryTextStoringService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class StoringConfiguration {

    @Primary
    @Bean("text")
    public StoreService textStoreService(StoringProperties properties) {
        switch (properties.getStoreType()) {
            case FILE:
                return new FileTextStoringService();
            case IN_MEMORY:
                return new InMemoryTextStoringService();
            default:
                throw new UnsupportedOperationException("Storing type not supported: " + properties.getStoreType());
        }
    }

    @Bean("hash")
    public StoreService hashStoreService(StoringProperties properties) {
        switch (properties.getStoreType()) {
            case FILE:
                return new FileHashStoringService();
            case IN_MEMORY:
                return new InMemoryHashStoringService();
            default:
                throw new UnsupportedOperationException("Storing type not supported: " + properties.getStoreType());
        }
    }

    @Bean
    public MessageBuilder messageBuilder(StoringProperties properties) {
        switch (properties.getBuilderType()) {
            case INJECTION:
                return new InjectionBuilder();
            case CONSTRUCTOR:
                return new ConstructorBuilder();
            default:
                throw new UnsupportedOperationException("Message builder type not supported: " + properties.getBuilderType());
        }
    }

}
