package org.homework1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("message-storing.properties")
public class StoringProperties {

    @Value("${repository.type}")
    private StoreType storeType;

    public StoreType getStoreType() {
        return storeType;
    }
}
