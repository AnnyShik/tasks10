package com.annyshik;

import java.util.Random;
import java.util.Scanner;

public class Main {

//    public static int[][] initializeRandomMassive(int mass[][], int m, int n) {
//        /***Заполнение двумерного массива случайными числами*/
//        Random random = new Random();
//        for (int i = 0; i < n; i++) {
//            System.out.println();
//            for (int j = 0; j < m; j++) {
//                mass[i][j] = random.nextInt(10); //в скобках указать максимальное значение ячейки
//                System.out.print(mass[i][j] + " ");
//            }
//        }
//        return mass;
//    }

    public static int[][] returnMassive(int m, int n) {
        int mass[][] = new int[n][m];
        return showAllMassive(mass, m, n);
    }

    public static int[][] showAllMassive(int[][] mass, int m, int n) {
        /*** вывод всего двумерного массива с каждой новой строки */
        Random random = new Random();
        System.out.println("Ваш массив: ");
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                mass[i][j] = random.nextInt(100);
                System.out.print(mass[i][j] + " ");
            }
        }
        System.out.println("");
        return mass;
    }

//    public static int getSummOfString(int[][] printMass) {
//        int sum = 0;
///***суммирование каждого элемента массива*/
//        for (int num : printMass) {
//            sum += num;
//        }
//        return sum;
//    }

    public static void task1(int m, int n) {
        int arr[][] = returnMassive(m, n);
        System.out.println("Число в правом верхнем углу: " + arr[0][m - 1]);
        System.out.println("Число в левом нижнем углу: " + arr[n - 1][0]);
    }

    public static void task2(int m, int n) {
        int mass[][] = new int[n][m];
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
                System.out.print(arr[i][2] + " ");
            }
        }
    }

//    public static int task3(int n, int m) {
//        int mass[][] = new int[n][m];
//        int arr[][] = returnMassive(m, n);
//
//        int maxString = getSummOfString(arr);
//        // int maxString = (sum < 0) ? -sum : sum;
//        // или
//
//        // Переменной maxString задаем минимальное значение.
//        //  int maxString = 0;
//        // Перебираем все элементы массива.
//        for (int i = 0; i < n; i++) {
//            System.out.println();
//            for (int j = 0; j < m; j++) {
//                // Переменной maxString с помощью метода Math.maxString() присваиваем максимальное значение
//                // путем выбора наибольшего из двух значений ("старого" значения maxString и значения элемента).
//
//                maxString = Math.max(maxString, mass[]);
//            }
//            System.out.println();
//        }
//        // Выводим на экран наибольшее число массива mass.
//        System.out.println("Максимальный элемент в массиве mass: " + maxString);
//        return maxString;
//    }

//    public static int task4(int sum, int sumSum) {
//        int arr[][] = returnMassive();
//
//        int arraySumma = getSummOfString(arr);
///***суммирование всех сумм массивов*/
//        for (int num = 0; num <= sum; num++) {
//            sumSum += num;
//        }
//        System.out.println("Сумма элементов матрицы равна: " + arraySumma);
//        return arraySumma;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк массива: ");
        int n = sc.nextInt();
        System.out.println("Введите кол-во столбцов: ");
        int m = sc.nextInt();
        //  returnMassive();
        //    task1(m, n);
        task2(m, n);
        //        task3(m, n);
        //task4(m, n);
    }

}
