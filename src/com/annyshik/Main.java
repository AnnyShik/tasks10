package com.annyshik;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void task4() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во строк массива: ");
        int n = scan.nextInt(); //вместо mass1.length
        System.out.println("Введите кол-во столбцов: ");
        int m = scan.nextInt(); // вместо mass1[0].length
        int mass1[][] = new int[n][m];
/***Заполнение двумерного массива случайными числами*/
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mass1[i][j] = random.nextInt(100); //в скобках указать максимальное значение ячейки
            }
        }

/*** вывод всего двумерного массива с каждой строки */
        int sum = 0;
        int sumSum = 0;
        for (int[] printMass : mass1) {
            System.out.println(Arrays.deepToString(new int[][]{printMass}) + " ");

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

    public static void task2() {
        //Вывести все элементы 5-й строки. Вывести элементы 2-го столбца массива.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк массива: ");
        int n = sc.nextInt();
        System.out.println("Введите кол-во столбцов: ");
        int m = sc.nextInt();
        int[][] mass2 = new int[n][m];

        Random random = new Random();
        System.out.println("Вывод массива: ");

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                mass2[i][j] = random.nextInt(100);
                System.out.print(mass2[i][j] + " ");
            }
        }
        System.out.println("");


        System.out.println("Выводим последнюю строку массива: ");

        for (int i = n - 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mass2[i][j] + " ");
            }
            System.out.println("");
            System.out.println("Выводим последнего элемента строки: " + mass2[n - 1][m - 1]);
        }
    }


    public static void main(String[] args) {
       // task4();
        task4();
    }
}
