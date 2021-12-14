package edu.sda.grcy.patterns2.creational.factoryMethod;

public class FactoryMethodUsage {

    public static void main(String[] args) {

        final String type = args[0];  //???
//        final String type = "PC";
//        final String type = "Board";
        GameFactory gameFactory;

        if (type.equals("PC")) {
            gameFactory = new ValorantGameCreator();
        } else if (type.equals("Board")){
            gameFactory = new MonopolyGameCreator();
        } else {
            throw new RuntimeException("unknown game type");
        }

        Game createdGame = gameFactory.create();
        System.out.println("Created game " + createdGame);

        //Wyskauje ArrayIndexOutOfBoundException : Index 0 out of bounds for lenght 0
        //CH*jowe rozwiązanie


    }
}
