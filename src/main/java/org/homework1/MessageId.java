package org.homework1;

import java.util.UUID;

public class MessageId {
    private String id = UUID.randomUUID().toString();

    @Override
    public String toString() {
        return "MessageId{" +
                "id='" + id + '\'' +
                '}';
    }
}
