package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(integer -> integer * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return array.stream().map(i -> letters[i - 1]).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        return array.stream().map(i -> {
            if (i < letters.length) {
                return letters[i - 1];
            } else {
                Integer firstLetterIndex = (i - 1) / letters.length;
                Integer secondLetterIndex = (i - 1) % letters.length;
                return letters[firstLetterIndex - 1].concat(letters[secondLetterIndex]);
            }
        }).collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }
}
