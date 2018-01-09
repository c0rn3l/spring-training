package org.homework1;

public class Message {
    private MessageId id;

    public Message(){
        this.id = new MessageId();
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                '}';
    }
}
