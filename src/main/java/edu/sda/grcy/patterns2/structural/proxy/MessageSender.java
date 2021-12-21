package edu.sda.grcy.patterns2.structural.proxy;

public interface MessageSender {
    void sendMessage(String channelName, String username, String messageText);
}
