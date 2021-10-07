package com.fastcampus.interfaceex.test;

public class QuickSort implements Sort{
    @Override
    public void ascending(int[] num) {
        System.out.println("QuickSort ascending");
    }

    @Override
    public void descending(int[] num) {
        System.out.println("QuickSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("QuickSort 입니다.");
    }
}
