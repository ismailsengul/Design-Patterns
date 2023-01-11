package Strategy.duck;

import Strategy.behaviour.fly.FlyWithWings;
import Strategy.behaviour.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");
        super.display();
    }
}
