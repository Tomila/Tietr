/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackiterator;

/**
 *
 * @author kamaj
 */
interface Iterator {
    boolean hasNext();
    Object next();
}

public class StackIterator implements Iterator {
    private ListItem  current;
    private Stack container;

    StackIterator (Stack c) { 
        container = c;
        current = container.top;
    }
 
    public boolean hasNext() {
        if (current == null)
            return false;
        else
            return true;
    }
 
    public ListItem next() {
        ListItem oldCurrent = current;
        current=current.getLink();
        return oldCurrent;
    }

}

