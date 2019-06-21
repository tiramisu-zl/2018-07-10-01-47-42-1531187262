package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return arrayList.stream().reduce((acc, item) -> acc > item ? acc : item).get();
    }

    public double getMinimum() {
        return arrayList.stream().reduce((acc, item) -> acc < item ? acc : item).get();
    }

    public double getAverage() {
        return (double) arrayList.stream().reduce((acc, item) -> acc += item).orElse(0) / arrayList.size();
    }

    public double getOrderedMedian() {
        List<Integer> sortedList = arrayList.stream().sorted().collect(Collectors.toList());
        int size = sortedList.size();
        if (size % 2 == 1) {
            return sortedList.get((size - 1) / 2);
        } else {
//            return (double)(sortedList.get(size / 2) + sortedList.get(size / 2 - 1)) / 2;
            return (sortedList.get(size / 2)*1.0 + sortedList.get(size / 2 - 1)*1.0) / 2;
        }
    }

    public int getFirstEven() {
        return arrayList.stream().filter(item -> item % 2 == 0).findFirst().get();
    }

    public int getIndexOfFirstEven() {
        int index=0;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                index = i;
                break;
            }
        }

        return index;
        //不知道这里考察的是该用什么方式来拿下标
    }

    public boolean isEqual(List<Integer> arrayList) {
        return false;
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
//        arrayList.stream().forEach(singleLink::addTailPointer);
//        singleLink.getNode(6);
    }

    public int getLastOdd() {
        List<Integer> oddList = arrayList.stream().filter(item -> item % 2 != 0).collect(Collectors.toList());
        return oddList.get(oddList.size()-1);
    }

    public int getIndexOfLastOdd() {
        int index=0;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 != 0) {
                index = i;
            }
        }

        return index;
    }
}
