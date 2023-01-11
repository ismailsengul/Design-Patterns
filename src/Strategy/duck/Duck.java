package Strategy.duck;

import Strategy.behaviour.fly.FlyBehaviour;
import Strategy.behaviour.quack.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void swim(){
        System.out.println("I am swimming!");
    }

    public void display() {
        swim();
        performFly();
        performQuack();
        System.out.println("");
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }

}
