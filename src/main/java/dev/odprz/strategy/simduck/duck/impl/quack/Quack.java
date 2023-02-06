package dev.odprz.strategy.simduck.duck.impl.quack;

import dev.odprz.strategy.simduck.duck.interf.quack.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack Quaaack!");
    }
}
