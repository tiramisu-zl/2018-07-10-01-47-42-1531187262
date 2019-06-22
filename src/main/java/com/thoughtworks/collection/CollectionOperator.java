package com.thoughtworks.collection;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {

        LinkedList<Integer> result = new LinkedList<>();

        boolean isRevers = left > right;
        int max = Math.max(left, right);
        int min = Math.min(left, right);

        for (int i = min; i <= max; i++) {
            if (isRevers) {
                result.addFirst(i);
            } else {
                result.addLast(i);
            }
        }
        return result;


//        Integer[] items = new Integer[max - min +1];
//        int index = 0;
//        for (int i = min ; i <= max; i++) {
//            items[index++] = i;
//        }
//        if (isRevers) {
//            Arrays.sort(items, Comparator.reverseOrder());
//        }
//
//        return Arrays.asList(items);


//        if (left > right) {
//            for (int i = left; i >= right; i--) {
//                result.add(i);
//            }
//        } else {
//            for (int i = left; i <= right; i++) {
//                result.add(i);
//            }
//        }
//        return result;

    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        LinkedList<Integer> result = new LinkedList<>();

        boolean isRevers = left > right;
        int max = Math.max(left, right);
        int min = Math.min(left, right);

        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                if (isRevers) {
                    result.addFirst(i);
                } else {
                    result.addLast(i);
                }
            }
        }
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        LinkedList<Integer> result = new LinkedList<>();

        for (int i: array) {
           if (i % 2 == 0) {
               result.add(i);
           }
        }

        return result;
    }

    public int popLastElment(int[] array) {
//        int length = array.length;
//        return array[length-1];

        return Arrays.stream(array).reduce((first, second) -> second).getAsInt();
//        return Arrays.stream(array).skip(array.length - 1).findFirst().orElse(0);
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> secondList = Arrays.stream(secondArray).boxed().collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();

        for (int i: firstArray) {
            if (secondList.contains(i)) {
                result.add(i);
            }
        }
        return result;

        //基本类型 和 与之对应的对象类型；
        //装箱 （基本类型转化成对象类型） 、拆箱（反之）大部分时候是自动的，偶尔需要手动操作
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> firstList = Arrays.asList(firstArray);
        List<Integer> secondList = Arrays.asList(secondArray);

        List<Integer> result = new ArrayList<>();

        for (Integer i: firstList) {
            if (!secondList.contains(i)) {
                result.add(i);
            }
        }

        for (Integer i: secondList) {
            if (!firstList.contains(i)) {
                result.add(i);
            }
        }
        return result;

    }

}
