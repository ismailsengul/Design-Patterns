package StrategyPattern;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void performFly(){
        this.flyBehavior.fly();
    }
    void performQuack(){
        this.quackBehavior.quack();
    }
    void swim(){
        System.out.println("I am swimming!");
    }

    void display(){
        this.swim();
        System.out.println("I am just a StrategyPattern.Duck!");
    }
}
