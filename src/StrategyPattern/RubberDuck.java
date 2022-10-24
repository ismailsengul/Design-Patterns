package StrategyPattern;

public class RubberDuck extends Duck{


    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    void display() {
        System.out.println("I am a Rubber StrategyPattern.Duck!");
        super.swim();
    }
}
