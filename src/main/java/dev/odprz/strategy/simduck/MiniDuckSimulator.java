package dev.odprz.strategy.simduck;

import dev.odprz.strategy.simduck.duck.Duck;
import dev.odprz.strategy.simduck.duck.impl.fly.FlyRocketPowered;
import dev.odprz.strategy.simduck.duck.kind.*;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();
        decoy.performFly();

        Duck redhead = new RedheadDuck();
        redhead.display();
        redhead.performFly();
        redhead.performQuack();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();
        System.out.println("Wait, what????");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
