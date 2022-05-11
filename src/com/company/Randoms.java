package com.company;

import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Random;
import java.util.stream.IntStream;

public class Randoms implements Iterable<Integer> {
    protected Random random; // for random generator
    protected IntStream randomStream; // for Stream of integers
    protected PrimitiveIterator.OfInt primitiveIterator; // for iterator of Stream of integers

    public Randoms(int min, int max) {

        random = new Random();
        randomStream = random.ints(min, max + 1); // make stream of randoms integers values
        primitiveIterator = randomStream.iterator(); // make iterator of stream of randoms integers values
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true; // always return true, because we need unlimited int values
            }

            @Override
            public Integer next() {
                return primitiveIterator.nextInt(); // when call next() method on iterator, return next random int value
            }
        };
    }
}