package com.oracle.test;


import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String args[]) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

        shuffle(arr);

        System.out.println(Arrays.toString(arr));

        sortQuickly(arr);

        System.out.println(Arrays.toString(arr));

    }

    //method
    public static void shuffle(int[] arr) {

        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int current = arr[i];
            int random = new Random().nextInt(len);
            if (random > 0.5) {
                arr[i] = arr[random];
                arr[random] = current;
            }
        }

    }

    public static void sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int max = arr[0];
            int index = 0;
            int j = 0;
            for (j = 0; j < len - i; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    index = j;
                }
            }


            arr[index] = arr[len - 1 - i];
            arr[len - 1 - i] = max;
            System.out.println(Arrays.toString(arr) + index + "-" + (len - 1 - i));
        }
    }

    public static void sortQuickly(int[] arr) {
        int min, max, idxMin = 0, idxMax = 0;
        int len = arr.length;
        for (int i = 0; i < len/2; i++) {
            min = arr[i];
            max = arr[i];
            for (int j = i; j < len - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    idxMax = j;
                }
                if (arr[j] < min) {
                    min = arr[j];
                    idxMin = j;
                }
            }
            System.out.println(i);
            System.out.println(min + "-" + max);
            arr[idxMax] = arr[len - i - 1];
            arr[len - i - 1] = max;
            arr[idxMin] = arr[i];
            arr[i] = min;
            System.out.println(Arrays.toString(arr));

        }
    }
}


class Student {
    /**
     * 年龄
     */
    private int age;

    public void method() {

    }

}
