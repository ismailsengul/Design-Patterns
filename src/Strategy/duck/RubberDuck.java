package Strategy.duck;

import Strategy.behaviour.fly.FlyNoWay;
import Strategy.behaviour.quack.MuteQuack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck");
        super.display();
    }
}
