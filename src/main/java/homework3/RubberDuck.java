package homework3;

import homework3.fly.FlyNoWay;
import homework3.quack.Squeak;

class RubberDuck extends Duck {
    RubberDuck() {
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    void display() {
        System.out.println("i'm a rubber duck");
    }
}
