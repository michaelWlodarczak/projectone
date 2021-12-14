package edu.sda.grcy.patterns2.creational.builder.currentClass;

public class Toy {
    private String name;
    private String type;
    private String madeOf;

    Toy(final String name, final String type, final String madeOf) {
        this.name = name;
        this.type = type;
        this.madeOf = madeOf;
    }

    // dedykowana metoda do uzyskania informacji zamiast toString
    // - poniewaz toString nie powinien sluzyc klientowi
    // tylko programiscie, np. do uzyskiwania logow
    public String getToyInfo(){
        return "\nToy: \n\tname - " + name +
                "\n\ttype - " + type +
                "\n\tmade of  - " + madeOf;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(final String madeOf) {
        this.madeOf = madeOf;
    }
}
