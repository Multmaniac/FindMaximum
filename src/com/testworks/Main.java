package com.testworks;


import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
// Для проверки работы метода генерируется массив случайной длины (в диапазоне 1-20 элементов).
        int[] randomArray = new int[ThreadLocalRandom.current().nextInt(1, 21)];
        System.out.println(String.format("Сгенерированный массив из %d элементов:", randomArray.length));
//Затем он заполняется случайными целыми числами 0-99.
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = ThreadLocalRandom.current().nextInt(100);
            System.out.print(randomArray[i] + " ");
        }
        System.out.println();
// Вызов метода поиска индекса элемента с максимальным значением и вывод результата в консоль.
        System.out.println(String.format("Элемент с индексом %d имеет максимальное значение.", findIndexOfMaxElement(randomArray)));
    }

    public static int findIndexOfMaxElement(int[] array) {
        // Если максимальных значений несколько, метод вернет индекс первого из них.
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[index]) index = i;
        }
        return index;
    }
}
