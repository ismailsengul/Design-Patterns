package Strategy.behaviour.quack;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("QUACK!");
    }
}
