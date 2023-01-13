package Iterator;

import Iterator.menu.DinerMenu;
import Iterator.menu.Menu;
import Iterator.menu.PancakeHouseMenu;

public class MenuTestDrive {

    public static void main(String args[]) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
