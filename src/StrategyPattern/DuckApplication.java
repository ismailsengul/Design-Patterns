package StrategyPattern;

public class DuckApplication {
    public static void main(String[] args) {


        Duck mallardDuck = new MallardDuck(new FlyWithWings(),new Quack());
        Duck redheadDuck = new RedheadDuck(new FlyWithWings(),new Quack());
        Duck rubberDuck = new RubberDuck(new FlyNoWay(),new Squeak());

        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        System.out.println();
        redheadDuck.display();
        redheadDuck.performQuack();
        redheadDuck.performFly();
        System.out.println();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
    }
}
