package com.thoughtworks.collection;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> list = new ArrayList<>();

        int random1 = random.nextInt(3);

        for (int i = number; (i - random1) > 0; ) {
            i = i - random1;
            list.add(i);
        }

        return list;
    }
}
