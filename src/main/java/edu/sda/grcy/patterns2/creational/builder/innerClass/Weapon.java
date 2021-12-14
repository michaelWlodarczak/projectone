package edu.sda.grcy.patterns2.creational.builder.innerClass;

import java.util.ArrayList;
import java.util.List;

public class Weapon {

    private String type;
    private String name;
    private Integer damage;
    private Long durability;
    private List<String> perks;

    private Weapon(final String type,
                   final String name,
                   final Integer damage,
                   final Long durability,
                   final List<String> perks) {
        this.type = type;
        this.name = name;
        this.damage = damage;
        this.durability = durability;
        this.perks = perks;
    }

    // dedykowana metoda do uzyskania informacji zamiast toString
    // - poniewaz toString nie powinien sluzyc klientowi
    // tylko programiscie, np. do uzyskiwania logow
    public String getWeaponInfo(){
        return "\nWeapon: \n\ttype - " + type +
                "\n\tname - " + name +
                "\n\tdamage - " + damage +
                "\n\tdurability - " + durability +
                "\n\tperks - " + perks;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(final Integer damage) {
        this.damage = damage;
    }

    public Long getDurability() {
        return durability;
    }

    public void setDurability(final Long durability) {
        this.durability = durability;
    }

    public List<String> getPerks() {
        return perks;
    }

    public void setPerks(final List<String> perks) {
        this.perks = perks;
    }

    public static class Builder{
        private String type;
        private String name;
        private Integer damage;
        private Long durability;
        private List<String> perks = new ArrayList<>();

        public Builder withType(String type){
            this.type=type;
            return this;
        }

        public Builder withName(String name){
            this.name=name;
            return this;
        }

        public Builder withDamage(Integer damage){
            this.damage=damage;
            return this;
        }

        public Builder withDurability(Long durability){
            this.durability=durability;
            return this;
        }

        public Builder withPerks(List<String> perks){
            this.perks=perks;
            return this;
        }

        //metoda budujaca obiekt docelowy
        public Weapon build(){
            return new Weapon(type,name,damage,durability,perks);
        }
    }
}
