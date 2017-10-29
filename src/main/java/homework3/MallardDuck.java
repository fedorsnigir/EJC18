package homework3;

import homework3.fly.FlyWithWings;
import homework3.quack.Quack;

class MallardDuck extends Duck {

    MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("i'm a mallard duck");
    }
}
