package Singleton;

public class SingletonApplication {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.toString());
    }

}
