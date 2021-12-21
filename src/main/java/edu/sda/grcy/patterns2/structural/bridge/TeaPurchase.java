package edu.sda.grcy.patterns2.structural.bridge;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TeaPurchase implements DrinkPurchase{

    @Override
    public Drink buy(Double cost) {
        log.info("Buying a a tea for {}", cost);
        return new Tea();
    }
}
