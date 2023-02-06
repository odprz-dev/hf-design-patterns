package dev.odprz.strategy.simduck.duck.kind;

import dev.odprz.strategy.simduck.duck.Duck;
import dev.odprz.strategy.simduck.duck.impl.fly.FlyNoWay;
import dev.odprz.strategy.simduck.duck.impl.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Looks like a Decoy Duck!");
    }
}
