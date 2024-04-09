package org.example;

import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private int min;
    private int max;
    //private final PrimitiveIterator.OfInt randomIterator;
    protected Random random;

    public Randoms(int min, int max) {
       // randomIterator = new Random().ints(min, (max + 1)).iterator();
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new randomIterator();
    }
    public class randomIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt(max - min + 1) + min;
        }

    }





    //...
}