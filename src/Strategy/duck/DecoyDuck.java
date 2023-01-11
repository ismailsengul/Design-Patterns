package Strategy.duck;

import Strategy.behaviour.fly.FlyNoWay;
import Strategy.behaviour.quack.Squeak;

public class DecoyDuck extends Duck{

    public DecoyDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("I am a Decoy Duck");
        super.display();
    }
}
