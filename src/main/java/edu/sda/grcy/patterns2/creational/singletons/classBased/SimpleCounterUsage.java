package edu.sda.grcy.patterns2.creational.singletons.classBased;

public class SimpleCounterUsage {
    public static void main(String[] args) {

        SimpleCounter simpleCounterA = SimpleCounter.getInstance();
        SimpleCounter simpleCounterB = SimpleCounter.getInstance();
        System.out.println(simpleCounterA == simpleCounterB);
        // true -> obie referencje wskazują na ten SAM obiekt

        simpleCounterA.increment();
        simpleCounterB.increment();
        System.out.println(simpleCounterA.getCurrentCount()); // 2

    }
}
