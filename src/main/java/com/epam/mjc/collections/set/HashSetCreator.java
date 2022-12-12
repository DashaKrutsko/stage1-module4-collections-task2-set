package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {

    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer list : sourceList) {
            if (list % 2 == 0) {
                int i = 1;
                while (list % i == 0) {
                    int number = list / i;
                    hashSet.add(number);
                    i = i * 2;
                }
            } else {
                int number = list;
                hashSet.add(number);
                hashSet.add(number * 2);
            }
        }
        return hashSet;
    }
}
