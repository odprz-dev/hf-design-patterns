package dev.odprz.strategy.simduck.duck.impl.fly;

import dev.odprz.strategy.simduck.duck.interf.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Sorry I can´t fly! :( ");
    }
}
