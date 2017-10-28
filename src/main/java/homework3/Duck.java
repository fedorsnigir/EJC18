package homework3;

import homework3.fly.FlyBehaviour;
import homework3.quack.QuackBehaviour;

abstract class Duck {
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;

    abstract void display();

    void performFly() {
        flyBehaviour.fly();
    }

    void performQuack() {
        quackBehaviour.quack();
    }

    void swim() {
        System.out.println("all ducks can swim");
    }
}
