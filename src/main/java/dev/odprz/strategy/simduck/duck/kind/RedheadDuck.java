package dev.odprz.strategy.simduck.duck.kind;

import dev.odprz.strategy.simduck.duck.Duck;
import dev.odprz.strategy.simduck.duck.impl.fly.FlyWithWings;
import dev.odprz.strategy.simduck.duck.impl.quack.Squeak;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Looks like a Redhead Duck!");
    }
}
