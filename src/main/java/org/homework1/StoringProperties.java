package org.homework1;

import org.homework1.service.builder.BuilderType;
import org.homework1.service.storing.StoreType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("message-storing.properties")
public class StoringProperties {

    @Value("${repository.type}")
    private StoreType storeType;

    @Value("${message.instantiation.type}")
    private BuilderType builderType;

    public StoreType getStoreType() {
        return storeType;
    }

    public BuilderType getBuilderType() {
        return builderType;
    }
}
