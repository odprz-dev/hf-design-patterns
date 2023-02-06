package dev.odprz.strategy.simduck.duck.impl.fly;

import dev.odprz.strategy.simduck.duck.interf.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
