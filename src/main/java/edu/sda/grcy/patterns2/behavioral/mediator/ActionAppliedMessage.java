package edu.sda.grcy.patterns2.behavioral.mediator;


import lombok.extern.slf4j.Slf4j;

@Slf4j // Causes lombok to generate a logger field.
public class ActionAppliedMessage implements Component{

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void displayInfo(){
        log.info("Action was applied successfully");
    }

    @Override
    public void sendRequest() {
        mediator.sendInfo(this, "Action applied message");
    }



}
