package com.fastcampus.interfaceex.test;

import java.io.IOException;

public class SortTest {
    public static void main(String[] args) throws IOException {
        Sort sort = null;

        int ch = System.in.read();
        if (ch == 'B') {
            sort = new BubbleSort();
        } else if (ch == 'Q') {
            sort = new QuickSort();
        }

        sort.ascending(new int[]{});
        sort.descending(new int[]{});
        sort.description();
    }
}
