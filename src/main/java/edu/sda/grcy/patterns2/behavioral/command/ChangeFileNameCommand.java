package edu.sda.grcy.patterns2.behavioral.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChangeFileNameCommand implements Command{

    private final JavaFile javaFile;
    private final String newName;
    private String previousName = null;

    public ChangeFileNameCommand(JavaFile javaFile, String newName) {
        this.javaFile = javaFile;
        this.newName = newName;
    }

    @Override
    public void apply() {

    }

    @Override
    public void cancel() {

    }
}
