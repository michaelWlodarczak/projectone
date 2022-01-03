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
        if(javaFile.getFileName().equals(newName)){
            log.warn("Cannot change file name to same one");
        }else {
            previousName = javaFile.getFileName();
            javaFile.setFileName(newName);
            javaFile.setClassName(newName.substring(0,newName.length()-5));
            // lack of validation! + simplified solution - we don't change classname in lines field
            log.info("File name changed to " + newName);
        }
    }

    @Override
    public void cancel() {
        if(previousName==null){
            log.warn("Cannot cancel command");
        }else {
            javaFile.setFileName(previousName);
            javaFile.setClassName(previousName);
            previousName=null;
        }
    }
}
