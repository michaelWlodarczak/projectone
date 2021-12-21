package edu.sda.grcy.patterns2.structural.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CoffeePurchase implements DrinkPurchase{

    @Override
    public Drink buy(Double cost) {
        log.info("Buying a a coffee for {}", cost); // same like in proxy - mvn dependency
        return new Coffee();
    }
}
