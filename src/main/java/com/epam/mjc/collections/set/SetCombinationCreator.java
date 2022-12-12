package com.epam.mjc.collections.set;


import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {

    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet1 = new HashSet<>(thirdSet);
        resultSet1.removeAll(firstSet);
        resultSet1.removeAll(secondSet);
        Set<String> resultSet = new HashSet<>(firstSet);
        resultSet.addAll(firstSet);
        resultSet.retainAll(secondSet);
        resultSet.removeAll(thirdSet);
        resultSet.addAll(resultSet1);
        return resultSet;
    }
}
