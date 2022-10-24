package StrategyPattern;

public class RedheadDuck extends Duck {


    public RedheadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    void display() {
        System.out.println("I am a Redhead StrategyPattern.Duck!");
        super.swim();
    }
}
