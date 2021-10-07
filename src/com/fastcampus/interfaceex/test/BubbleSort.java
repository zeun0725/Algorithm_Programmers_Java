package com.fastcampus.interfaceex.test;

public class BubbleSort implements Sort{
    @Override
    public void ascending(int[] num) {
        System.out.println("BubbleSort ascending");

    }

    @Override
    public void descending(int[] num) {
        System.out.println("BubbleSort descending");

    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("BubbleSort 입니다.");
    }
}
