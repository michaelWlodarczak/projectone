package edu.sda.grcy.patterns2.structural.proxy;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j //Causes lombok to generate a logger field.
public class SlackMessageSender implements MessageSender{

    private final List<Message> messages = new ArrayList<>();

    @Override
    public void sendMessage(final String channelName, final String username, final String messageText) {
        final Message message = new Message(channelName,username,messageText);
        log.info("Sent message {}", message); // to use that line you need to add some maven dependency for @Slf4j annotation
        messages.add(message);
        log.info("Messages: {}", messages);
    }
}
