package edu.sda.grcy.patterns2.structural.bridge;

public class App {
    public static void main(String[] args) {

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        TeaPurchase teaPurchase = new TeaPurchase();
        CoffeePurchase coffeePurchase = new CoffeePurchase();

        teaPurchase.buy(3.0);
        coffeePurchase.buy(5.0);

        //TODO

    }
}
