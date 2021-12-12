package edu.sda.grcy.patterns.structural.flyweight;

public class FordMustang {
    private FordMustangBase mustangBase;
    private String radio;

    public FordMustang(String color, String engine, String radio) {
        System.out.println(this.getClass() + " constructor");
        this.mustangBase = MustangBaseFactory.getMustangBase(color, engine);
        this.radio = radio;
    }

    public String retriveCarInfo(){
        return new StringBuilder("Ford Mustang: kolor ")
                .append(mustangBase.getColor())
                .append(", silnik: ")
                .append(mustangBase.getEngine())
                .append(", radio: ")
                .append(radio)
                .toString(); // StringBuilder nie ma klasycznej metody build(), tylko "toString()"
    }
}
