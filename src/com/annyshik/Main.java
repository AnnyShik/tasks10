package com.annyshik;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void task4() {

//   int mass1[][] = new int[(int) Math.random()][(int) Math.random()]; //указать размер массива
        int mass1[][] = new int[5][5];
/***Заполнение двумерного массива случайными числами*/
        Random random = new Random();
        for (int i = 0; i < mass1.length; i++) {
            for (int j = 0; j < mass1[0].length; j++) {
                mass1[i][j] = random.nextInt();
            }
        }
/*** вывод всего двумерного массива с каждой строки */
        int sum = 0;
        int sumSum = 0;
        for (int[] printMass : mass1) {
            System.out.println(Arrays.deepToString(new int[][]{printMass}));
/***суммирование каждого элемента массива*/
            for (int num : printMass) {
                sum = sum + num;
            }
            //System.out.println("Сумма элементов этого массива равна: " + sum);
        }
/***суммирование всех сумм массивов*/
        for (int num = 0; num <= sum; num++) {
            sumSum = sumSum + num;
        }
        System.out.println("Сумма элементов матрицы равна: " + sumSum);
    }

    public static void main(String[] args) {
        task4();
    }
}
