package edu.sda.grcy.patterns.creational.builder;

public class House {

    private String basement;
    private String walls;
    private String roof;

    private String garage;
    private String garden;

    private House(HouseBuilder builder){
        this.basement = builder.basement;
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.garage = builder.garage;
        this.garden = builder.garden;
    }

    public String getHouseInfo(){ // dedykowana metoda do uzyskania informacji zamiast toString - poniewaz toString nie powinien sluzyc klientowi tylko programiscie, np. do uzyskiwania logow
        return "\nHouse: \n\tbasement - " + basement +
                "\n\twalls - " + walls +
                "\n\troof - " + roof +
                "\n\tgarage - " + garage +
                "\n\tgarden - " + garden;
    }

    public static class HouseBuilder{
        private String basement;
        private String walls;
        private String roof;

        private String garage;
        private String garden;

        public HouseBuilder(String basement, String walls, String roof) {
            this.basement = basement;
            this.walls = walls;
            this.roof = roof;

            this.garage = "";
            this.garden = "";
        }
        public HouseBuilder withGarage(String garage){
            this.garage = garage;
            return this;
        }
        public HouseBuilder withGarden(String garden){
            this.garden = garden;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }
}
