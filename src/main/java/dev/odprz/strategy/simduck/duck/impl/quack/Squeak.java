package dev.odprz.strategy.simduck.duck.impl.quack;

import dev.odprz.strategy.simduck.duck.interf.quack.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!!!");
    }
}
