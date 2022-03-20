package edu.sda.grcy.patterns2.behavioral.mediator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WarningMessage implements Component{

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void showWarningessage(){
        log.warn("Are you sure?");
    }

    public void hideWarning(){
        log.warn("");
    }

    @Override
    public void sendRequest() {
        mediator.sendInfo(this,"Warning Message");
    }

}
