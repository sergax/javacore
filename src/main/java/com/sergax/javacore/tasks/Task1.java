package com.sergax.javacore.tasks;

import java.util.HashMap;
import java.util.Map;

/*Задание 1

        Дан массив целых чисел. Необходимо реализовать метод, который возвращает индексы массива,
        значения которых в сумме дают число переданное в массив.

        Предполагается, что массив содержит только уникальные числа и всегда имеет искомые числа.
        Один и тот же элемент не может быть использован дважды.

        array = [3, 8, 15, 17], Number = 23
        result = [1,2]

        Т.е. индексы 1 и 2 (значение 8 и 15) в сумме дают искомое число 23
*/
public class Task1 {
    public int[] indexReturn(int[] array, int number) throws Exception {
        // O(n^2)
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    return new int[]{i, j};
                }
            }
        }
        throw new Exception("Can't find this number");
    }

    public int[] indexReturnByMap(int[] array, int number) throws Exception {
        // O(1)
        Map<Integer, Integer> newMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            newMap.put(array[i], i);
        }
        for (int i = 0; i < array.length; i++) {
            int newNumber = number - array[i];

            if (newMap.containsKey(newNumber) && newMap.get(newNumber) != i) {
                return new int[]{i, newMap.get(newNumber)};
            }
        }
        throw new Exception("Can't find this number");
    }
}


