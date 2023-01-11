package Strategy.duck;

import Strategy.behaviour.fly.FlyNoWay;
import Strategy.behaviour.quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Model Duck!");
        super.display();
    }
}
