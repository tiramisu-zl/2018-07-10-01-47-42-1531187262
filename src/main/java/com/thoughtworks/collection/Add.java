package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) { // if right < left
        int count = 0;
        int start = leftBorder;
        int end = rightBorder;

        if (leftBorder > rightBorder) {
            start = rightBorder;
            end = leftBorder;
        }
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                count += i;
            }
        }
        return count;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int count = 0;
        int start = leftBorder;
        int end = rightBorder;

        if (leftBorder > rightBorder) {
            start = rightBorder;
            end = leftBorder;
        }
        for (int i = start; i <= end; i++) {
            if (i % 2 == 1) {
                count += i;
            }
        }
        return count;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        Integer sum = 0;
        for (Integer integer : arrayList) {
            sum += integer * 3 + 2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<>();

        for (Integer integer : arrayList) {
            if (integer % 2 == 1) {
                resultList.add(integer * 3 + 2);
            } else {
                resultList.add(integer);
            }
        }

        return resultList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        Integer sum = 0;
        for (Integer integer : arrayList) {
            if (integer % 2 == 1) {
                sum += integer * 3 + 5;
            }
        }
        return sum;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList<>();
        for (Integer integer : arrayList) {
            if (integer % 2 == 0) {
                evenList.add(integer);
            }
        }

        evenList.sort(Comparator.naturalOrder());

        // 冒泡排序算法，排序
        // 快速排序

        int size = evenList.size();
        return size % 2 == 0 ? (evenList.get(size / 2 -1) + evenList.get(size / 2)) / 2 : evenList.get((size - 1) / 2);
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList<>();
        for (Integer integer : arrayList) {
            if (integer % 2 == 0) {
                evenList.add(integer);
            }
        }

        Integer sum = 0;
        for (Integer integer : evenList) {
            sum += integer;
        }

        return sum / 2;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> evenList = new ArrayList<>();
        for (Integer integer : arrayList) {
            if (integer % 2 == 0) {
                evenList.add(integer);
            }
        }

        return evenList.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList<>();
        for (Integer integer : arrayList) {
            if (integer % 2 == 0) {
                evenList.add(integer);
            }
        }

//        List<Integer> unrepeatedList = new ArrayList<>();
//        evenList.stream().forEach(integer -> {
//            if (!unrepeatedList.contains(integer)) {
//                unrepeatedList.add(integer);
//            }
//        });
//
//        return unrepeatedList;
        return evenList.stream().distinct().collect(toList());
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (Integer integer : arrayList) {
            if (integer % 2 == 0) {
                evenList.add(integer);
            } else {
                oddList.add(integer);
            }
        }


        evenList.sort(Comparator.naturalOrder());
        oddList.sort(Comparator.reverseOrder());

//        return Stream.concat(evenList.stream(), oddList.stream())
//                .collect(toList());

        List<Integer> newList = new ArrayList<>(evenList);
        newList.addAll(oddList);
        return newList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 1; i < arrayList.size(); i++) {
            resultList.add((arrayList.get(i) + arrayList.get(i - 1)) * 3);
        }
        return resultList;
    }
}
