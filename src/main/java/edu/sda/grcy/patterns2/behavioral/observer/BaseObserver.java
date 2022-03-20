package edu.sda.grcy.patterns2.behavioral.observer;

public abstract class BaseObserver {

    private final ChatChannel chatChannel;

    public BaseObserver(final ChatChannel chatChannel) {
        this.chatChannel = chatChannel;
        chatChannel.subscribe(this);
    }

    public abstract void handleMessage(String message, String userType);

    public abstract String getObserverType();

    public void sendMessage(final String message){
        chatChannel.sendMessage(message, getObserverType());
    }
}
