package com.fastcampus.array;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.arraycopy(arr1, 0, arr2, 1, 3);
        for(int arr: arr2) {
            System.out.println(arr);
//            1
//            10
//            20
//            30
//            5
        }
    }
}
