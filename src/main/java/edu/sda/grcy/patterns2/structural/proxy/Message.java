package edu.sda.grcy.patterns2.structural.proxy;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Message {
    private String channelName;
    private LocalDateTime postDate;
    private String author;
    private String messageText;

    public Message(final String channelName,
                   final String author,
                   final String messageText) {
        this.channelName = channelName;
        this.author = author;
        this.messageText = messageText;
        this.postDate = LocalDateTime.now();
    }


}
