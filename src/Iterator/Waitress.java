package Iterator;

import Iterator.iterator.Iterator;
import Iterator.menu.DinerMenu;
import Iterator.menu.MenuItem;
import Iterator.menu.PancakeHouseMenu;

public class Waitress {

    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu,DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeHouseIterator = pancakeHouseMenu.createMenuIterator();
        Iterator dinerIterator = dinerMenu.createMenuIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeHouseIterator);

        System.out.println("MENU\n----\nLUNCH");
        printMenu(dinerIterator);


    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
