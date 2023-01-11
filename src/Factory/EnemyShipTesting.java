package Factory;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        Scanner scanner = new Scanner(System.in);

        String enemyShipOption = "";

        System.out.println("What type of ship ? (U / R / B)");

        if (scanner.hasNextLine()){
            enemyShipOption = scanner.nextLine().toUpperCase();
            theEnemy = shipFactory.makeEnemyShip(enemyShipOption);
        }
        if (theEnemy != null){
            doStuffEnemy(theEnemy);
        }
    }

    private static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
