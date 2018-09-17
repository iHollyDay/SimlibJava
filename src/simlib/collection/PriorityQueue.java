package simlib.collection;

import simlib.elements.Timer;

public class PriorityQueue<E extends Comparable> extends Collection {

    java.util.PriorityQueue<E> data;

    public PriorityQueue(String name, Timer timer) {
        super(name, timer);
        data = new java.util.PriorityQueue<>();
    }

    public void clear(){
        update();
        data.clear();
        size = 0;
    }

    public boolean contains( E element ){
        return data.contains( element );
    }

    public void offer( E element ){
        update();
        data.add( element );
        size ++;
    }

    public E peek(){
        return data.peek();
    }

    public E poll(){
        update();
        size --;
        return data.poll();
    }

    public boolean remove( E element ){
        update();
        if( remove( element ) ){
            size--;
            return true;
        }
        return false;
    }

}