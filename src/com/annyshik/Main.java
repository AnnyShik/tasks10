package com.annyshik;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[][] returnMassive() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк массива: ");
        int n = sc.nextInt(); //вместо mass.length
        System.out.println("Введите кол-во столбцов: ");
        int m = sc.nextInt(); // вместо mass[0].length
        int mass[][] = new int[n][m];
        return initializeRandomMassive(mass, m, n);
    }

    public static int[][] initializeRandomMassive(int mass[][], int m, int n) {
        /***Заполнение двумерного массива случайными числами*/
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                mass[i][j] = random.nextInt(10); //в скобках указать максимальное значение ячейки
                System.out.print(mass[i][j] + " ");
            }
            System.out.println("");
        }
        return mass;
    }

    public static void task1() {
        int arr[][] = returnMassive();
        System.out.println("Число в правом верхнем углу: " + arr[0][5]);
        System.out.println("Число в левом нижнем углу: " + arr[5][0]);
    }

    public static void task2(int mass[][], int m, int n) {
        //Вывести все элементы 5-й строки n. Вывести элементы 2-го столбца массива m.
        System.out.println("Выводим все элементы 5-й строки: ");
        for (int i = n - 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mass[5][j] + " ");
            }
            System.out.println("");
            System.out.println("Выводим все элементы 2-го столбца массива: " + mass[i][2]);
        }
    }

    public static int getSummOfString(int mass[][]) {
/*** вывод всего двумерного массива с каждой новой строки */
        int sum = 0;
        for (int[] printMass : mass) {
            System.out.println(Arrays.deepToString(new int[][]{printMass}) + " ");
/***суммирование каждого элемента массива*/
            for (int num : printMass) {
                sum += num;
            }
            //System.out.println("Сумма элементов этого массива равна: " + sum);
        }
        return sum;
    }

    public static void task4(int sum, int sumSum) {
        int arr[][] = returnMassive();

        int arraySumma = getSummOfString(arr);
/***суммирование всех сумм массивов*/
        for (int num = 0; num <= sum; num++) {
            sumSum += num;
        }

        System.out.println("Сумма элементов матрицы равна: " + sumSum);
    }

    public static void task3(int mass[][], int sum, int n, int m) {
        int maxString = (sum < 0) ? -sum : sum;
        // или

        // Переменной maxString задаем минимальное значение.
        int maxString = 0;
        // Перебираем все элементы массива.
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                // Переменной maxString с помощью метода Math.maxString() присваиваем максимальное значение
                // путем выбора наибольшего из двух значений ("старого" значения maxString и значения элемента).
                maxString = Math.max(maxString, mass[i][j]);
            }
            System.out.println("");
        }

        // Выводим на экран наибольшее число массива mass.
        System.out.println("Максимальный элемент в массиве mass: " + maxString);
    }

    public static void main(String[] args) {
        returnMassive();
        //task1();
        task4(sum, sumSum);
    }
}
