package dev.odprz.strategy.simduck.duck.kind;

import dev.odprz.strategy.simduck.duck.Duck;
import dev.odprz.strategy.simduck.duck.impl.fly.FlyNoWay;
import dev.odprz.strategy.simduck.duck.impl.quack.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Oh!! what kind of duck is it???");
    }
}
