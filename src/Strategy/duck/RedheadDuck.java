package Strategy.duck;

import Strategy.behaviour.fly.FlyWithWings;
import Strategy.behaviour.quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Redhead Duck");
        super.display();
    }
}
