package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arrays0 = {7, 8, 9, 19, 21, 29};
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int count;
        for (count = 0; count < arrays0.length; count++) {
            if (arrays0[count] == x) {
                System.out.println("Введенное число входит в заданный массив.");
                break;
            }
        }
        if (count == arrays0.length) {
            System.out.println("Введенное число не входит в заданный массив.");
        }

        System.out.println();

        int[] arrays1 = {10, 12, 17, 18, 28, 38, 40, 46};
        System.out.println("Введите число");
        Scanner scan1 = new Scanner(System.in);
        int y = scan1.nextInt();
        int count2;
        for (count2 = 0; count2 < arrays1.length; count2++) {
            if (arrays1[count2] == y) {
                break;
            }
        }

        if (count2 == arrays1.length) {
            System.out.println("Введенное число не входит в заданный массив.");
        return;
        }

        int[] arrays1modi = new int[arrays1.length - 1];
        for (int q = 0, w = 0; w < arrays1modi.length + 1; q++, w++) {
            if (arrays1[q] == y) {
                arrays1modi[q] = arrays1[w++];
            }
            arrays1modi[q] = arrays1[w];
        }
        System.out.println("Новый изменнённый массив " + Arrays.toString(arrays1modi));

        System.out.println();

        System.out.println("Введите размер массива");
        Scanner scan2 = new Scanner(System.in);
        int q = scan2.nextInt();
        int[] arrays2 = new int[q];
        Random rnd = new Random();
            for (int i = 0; i < arrays2.length; i++) {
            arrays2[i] = rnd.nextInt();
            }
        Arrays.sort(arrays2, 0, q);
        System.out.println(Arrays.toString(arrays2));
        System.out.println("Mini значение = " + (arrays2)[0]);
        System.out.println("Maxi значение = " + (arrays2)[q - 1]);
            double sum = 0;
            for (int z : arrays2) {
                sum += z;
            }
        System.out.println("Среденее арифм. значение = " + sum / arrays2.length);

        System.out.println();
        int[] arrays51 = {3, 8, 12, 4, 15};
        int[] arrays52 = {2, 6, 1, 7, 10};
        System.out.println(Arrays.toString(arrays51));
        System.out.println(Arrays.toString(arrays52));
            double sum51 = 0;
            for (int k : arrays51) {
                sum51 += k;
            }
        System.out.println("Среденее арифм. значение 1-го массива = " + sum51 / arrays51.length);
            double sum52 = 0;
            for (int m : arrays52) {
                sum52 += m;
            }
        System.out.println("Среденее арифм. значение 2-го массива = " + sum52 / arrays52.length);
            if ((sum51 / arrays51.length) > (sum52 / arrays52.length)) {
                System.out.println("Среденее арифм. значение 1-го > 2-го ");
            } else if ((sum51 / arrays51.length) < (sum52 / arrays52.length)) {
                System.out.println("Среденее арифм. значение 1-го < 2-го ");
            } else
        System.out.println("Среденее арифм. значение 1-го = 2-го ");
        }
    }