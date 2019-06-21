package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
       return Arrays.stream(array).flatMap(integer -> Stream.of(integer)).collect(Collectors.toList());
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        return Arrays.stream(array).flatMap(integer -> Stream.of(integer)).distinct().collect(Collectors.toList());
    }
}
