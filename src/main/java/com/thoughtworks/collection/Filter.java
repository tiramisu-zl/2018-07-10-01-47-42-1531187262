package com.thoughtworks.collection;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        return array.stream().filter(integer -> integer % 2 == 0).collect(toList());
    }

    public List<Integer> filterMultipleOfThree() {
        return array.stream().filter(integer -> integer % 3 == 0).collect(toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        return firstList.stream().filter(integer -> secondList.contains(integer)).collect(toList());
    }

    public List<Integer> getDifferentElements() {
        return array.stream().distinct().collect(toList());
    }
}