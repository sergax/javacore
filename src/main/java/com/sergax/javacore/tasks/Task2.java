package com.sergax.javacore.tasks;

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
    int counter = 0;

    public void duplicatesInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                while (array[i] == array[j + 1]) {
                    counter++;
                    System.out.println(counter);
                }
            }
        }
    }
}
