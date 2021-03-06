package edu.sda.grcy.patterns.creational.factory;

class MacBookAir extends MacBook {

    private String memory;
    private String disc;
    private int screenSize;

    MacBookAir(String memory, String disc, int screenSize) {
        this.memory = memory;
        this.disc = disc;
        this.screenSize = screenSize;
    }

    @Override
    public String getMemory() {
        return memory;
    }

    @Override
    public String getDisc() {
        return disc;
    }

    @Override
    public int getScreenSize() {
        return screenSize;
    }


}
