package edu.sda.grcy.patterns2.creational.singletons.enumBased;

public class SimpleCounterUsage {
    public static void main(String[] args) {
        SimpleCounter simpleCounterA = SimpleCounter.INSTANCE;
        SimpleCounter simpleCounterB = SimpleCounter.INSTANCE;

        System.out.println(simpleCounterA == simpleCounterB); // true

        simpleCounterA.increment();
        simpleCounterB.increment();
        System.out.println(simpleCounterA.getCurrentCount()); // 2
    }
}
