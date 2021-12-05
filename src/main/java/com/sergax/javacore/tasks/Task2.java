package com.sergax.javacore.tasks;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

/*
Задание 2
Дан массив целых чисел.
Необходимо реализовать метод, которые определяет, содержит ли данный массив дубликаты

Пример:
Array: [4,5,6,6,8]
Result: true
Число 6 повторяется 2 раза

Array: [4,5,6,7,8]
Result: false
Дубликатов нет

 */
public class Task2 {
    public boolean duplicatesInArray(int[] array) {
        // O(n^2)
        if (array.length <= 1) return false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean duplicatesInArrayByList(int[] array) {
        // O(log n)
        List<Integer> newList = new ArrayList<>();

        for (int j : array) {
            newList.add(j);
        }

        if (newList.size() < 1) return false;

        Collections.sort(newList);

        for (int i = 0; i < newList.size() - 1; i++) {
            if (Objects.equals(newList.get(i), newList.get(i + 1))) {
                return true;
            }
        }
        return false;
    }

    public boolean duplicatesInArrayByHashMap(int[] array) {
        // O(1)
        Map<Integer, Integer> newMap = new HashMap<>();
        for (int j : array) {
            if (!newMap.containsKey(j)) {
                newMap.put(j, 1);
            } else {
                return true;
            }
        }
        return false;
    }
}
