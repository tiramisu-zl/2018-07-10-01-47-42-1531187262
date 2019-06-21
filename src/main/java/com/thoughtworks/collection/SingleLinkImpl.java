package com.thoughtworks.collection;

import java.util.Arrays;

public class SingleLinkImpl implements SingleLink<Integer> {

    private Integer data;

    private SingleLinkImpl tails;

    public SingleLinkImpl() {

    }

    public SingleLinkImpl(Integer item) {
        this.data = item;
    }

    @Override
    public void addTailPointer(Integer item) {
        SingleLinkImpl head = this;
        while (head.tails != null) {
            head = head.tails;
        }

        head.tails = new SingleLinkImpl(item);

    }

    @Override
    public Integer getNode(int index) {
        SingleLinkImpl current = this;
        for (int i = 1; i < index; i++) {
            current = current.tails;
        }
        return current.data;
    }

    public static void main(String[] args) {
        SingleLink<Integer> link = new SingleLinkImpl(1);
        Integer[] array = new Integer[]{4, 6, 2, 3, 10, 9, 8, 11, 2, 19, 30};
        Arrays.stream(array).forEach(link::addTailPointer);

        System.out.println(link.getNode(6));
        System.out.println(link.getNode(7));

    }

}
