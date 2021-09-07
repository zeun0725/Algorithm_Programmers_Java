package com.fastcampus.array;

public class TowDimension {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3}, {4, 5, 6, 7}};

        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println();

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.println(anInt + " ");
            }
            System.out.println();
        }
    }
}
