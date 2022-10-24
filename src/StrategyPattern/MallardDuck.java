package StrategyPattern;

public class MallardDuck extends Duck{


    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    void display() {
        System.out.println("I am a Mallard StrategyPattern.Duck!");
        super.swim();
    }
}
