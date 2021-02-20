package com.programmers.practice;

import java.util.Arrays;

public class Practice4 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int _n = 0 ; _n < n; _n++) answer[_n] = (long) x * ( _n + 1 );
        return answer;
    }
}
