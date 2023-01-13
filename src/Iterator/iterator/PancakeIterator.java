package Iterator.iterator;

import Iterator.iterator.Iterator;
import Iterator.menu.MenuItem;

import java.util.ArrayList;

public class PancakeIterator implements Iterator {

    ArrayList<MenuItem> items;
    int position;

    public PancakeIterator(ArrayList items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null)
            return false;

        return true;
    }

    @Override
    public Object next() {
       MenuItem menuItem = items.get(position);
       position++;
       return menuItem;
    }
}
