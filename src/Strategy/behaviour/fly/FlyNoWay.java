package Strategy.behaviour.fly;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can not fly!");
    }
}
