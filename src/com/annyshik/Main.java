package com.annyshik;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[][] returnMassive(int m, int n) {
        int mass[][] = new int[n][m];
        return showAllMassive(mass, m, n);
    }

    public static int[][] showAllMassive(int[][] mass, int m, int n) {
        /*** вывод всего двумерного массива с каждой новой строки */
        int max = Integer.MIN_VALUE,
                maxString = -1,
                sum = 0;

        System.out.print("Ваш массив: ");
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                mass[i][j] = random.nextInt(100);
                sum += mass[i][j];
                System.out.print(mass[i][j] + " ");
            }
            if (max < sum) {
                max = sum;
                maxString = i;
            }
        }
        System.out.println("");
        return mass;
    }

    public static void task1(int m, int n) {
        int arr[][] = returnMassive(m, n);
        System.out.println("Число в правом верхнем углу: " + arr[0][m - 1]);
        System.out.println("Число в левом нижнем углу: " + arr[n - 1][0]);
    }

    public static void task2(int m, int n) {
        int arr[][] = returnMassive(m, n);
        System.out.println("Выводим все элементы 5-й строки: ");
        for (int i = n - 1; i < n; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[4][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Выводим все элементы 2-го столбца массива: ");
        for (int i = n - 1; i < n; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][1] + " ");
            }
            System.out.println();
        }
    }

    public static int getSummOfString(int mass[][], int n, int max, int maxString, int sum) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
             //   mass[i][j] = random.nextInt(100);
                sum += mass[i][j];
                System.out.print(mass[i][j] + " ");
            }
            if (max < sum) {
                max = sum;
                maxString = i;
            }
        }
        return maxString;
    }

    public static int task3(int n, int m) {
        int arr[][] = returnMassive(m, n);

      //  int mass[][] = new int[n][m];
        int max = Integer.MIN_VALUE,
                maxString = -1,
                sum = 0;
        maxString = getSummOfString(arr, n, max, maxString, sum);
        System.out.println();
        System.out.println("Номер максимальной строки " + (maxString + 1));
        System.out.print("Состав строки ");
        for (int j = 0; j < n; j++)
            System.out.print(arr[maxString][j] + " ");
        System.out.println();
        return maxString;
    }

    public static int task4(int n, int m) {
        int arr[][] = returnMassive(m, n);
        int sumSum = 0;
        for (n = 0; n < arr.length; n++) {
            for (m = 0; m < arr.length; m++) {
                sumSum += arr[n][m];
            }
        }
        System.out.println("Сумма элементов матрицы равна: " + sumSum);
        return sumSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк массива: ");
        int n = sc.nextInt();
        System.out.println("Введите кол-во столбцов: ");
        int m = sc.nextInt();

        //task1(m, n);
        //task2(m, n);
        //task3(m, n);
        task4(m, n);
    }
}
