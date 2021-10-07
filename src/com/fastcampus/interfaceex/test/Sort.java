package com.fastcampus.interfaceex.test;

public interface Sort {
    void ascending(int[] num);
    void descending(int[] num);
    default void description() {
        System.out.println("숫자를 정렬하는 알고리즘 입니다.");
    }
}
