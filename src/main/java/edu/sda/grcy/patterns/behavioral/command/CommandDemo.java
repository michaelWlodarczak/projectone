package edu.sda.grcy.patterns.behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {
        MyFile myFile1 = new MyFile("file.txt");
        String writeResult = myFile1.writeFile("aaa");
        System.out.println(writeResult);
        String updateResult = myFile1.updateFile("bbb");
        System.out.println(updateResult);

        krecha();

        OperationExecutor executor = new OperationExecutor();
        executor.executeOperation(new UpdateFileContentOperation(myFile1),"xxxx");
        System.out.println(myFile1.getContent());
        krecha();
//TODO - dokonczyc
        MyFile file2 = new MyFile("file2.txt");
        executor.executeOperation(new UpdateFileContentOperation(file2),"Nowy plik, nowa zawartosc");
        System.out.println(file2.getContent());
        krecha();
        executor.executeOperation(new CreateFileContentOperation(file2),"Nowy plik, nowa zawartosc");
        System.out.println(file2.getContent());
    }

    private static void krecha(){
        System.out.println("================");
    }
}
