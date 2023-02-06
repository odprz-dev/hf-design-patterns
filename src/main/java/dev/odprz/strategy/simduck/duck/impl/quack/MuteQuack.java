package dev.odprz.strategy.simduck.duck.impl.quack;

import dev.odprz.strategy.simduck.duck.interf.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        // do nothing
        System.out.println("I can't quack!!!");
    }
}
