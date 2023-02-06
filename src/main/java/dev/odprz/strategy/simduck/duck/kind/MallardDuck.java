package dev.odprz.strategy.simduck.duck.kind;

import dev.odprz.strategy.simduck.duck.Duck;
import dev.odprz.strategy.simduck.duck.impl.fly.FlyWithWings;
import dev.odprz.strategy.simduck.duck.impl.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Looks like a Mallard duck");
    }
}
