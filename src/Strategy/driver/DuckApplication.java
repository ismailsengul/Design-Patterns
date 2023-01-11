package Strategy.driver;

import Strategy.behaviour.fly.FlyRocketPowered;
import Strategy.duck.*;

public class DuckApplication {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.display();
    }
}
