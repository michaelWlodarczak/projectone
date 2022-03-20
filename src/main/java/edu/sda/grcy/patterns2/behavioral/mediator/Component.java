package edu.sda.grcy.patterns2.behavioral.mediator;

public interface Component {
    void sendRequest();

    default void sendRequest(String context){
        sendRequest();
    }
}
