package org.springtraining.services;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)
public class MessagingFacadeTest {

    private MessagingFacade facade;
    @Mock
    private MessagingService service;

    @Before
    public void before() {
        facade = new MessagingFacade(service);
    }

    @Test
    public void testSend() {
        String message = "test";
        facade.send(message);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSendWithException() {
        Mockito.doThrow(new IllegalArgumentException("error"))
                .when(service).sendMessages(any(String.class));
        String message = "test2";
        facade.send(message);


    }
}
