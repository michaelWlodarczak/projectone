package edu.sda.grcy.patterns2.creational.singletons.enumBased;

public enum SimpleCounter {
    INSTANCE;

    private int currentCount = 0;

    public int getCurrentCount() {
        return currentCount;
    }

    public void increment() {
        currentCount++;
    }
}
