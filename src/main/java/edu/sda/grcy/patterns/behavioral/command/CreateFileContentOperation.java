package edu.sda.grcy.patterns.behavioral.command;

public class CreateFileContentOperation implements Operation{
    private MyFile myFile;

    public CreateFileContentOperation(MyFile myFile) {
        this.myFile = myFile;
    }

    @Override
    public String performOperation(String content) {
        //sprawdzenie uprawnienie, logowanie czynnosci i samo pisanie do pliku
        System.out.println(getClass().getSimpleName() + " called for " + myFile.getFileName());
        return myFile.writeFile(content);
    }
}
