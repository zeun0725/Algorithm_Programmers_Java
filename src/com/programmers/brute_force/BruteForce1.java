package com.programmers.brute_force;

public class BruteForce1 {
    public int[] solution(int[] answers) {
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        int[] answer = {0,0,0};
        int ans_len = answers.length;
        for(int i = 0; i< ans_len; i++) {
            if (answers[i]==person1[i % person1.length]) {
                answer[0] += 1;
            }
            if (answers[i]==person2[i % person2.length]) {
                answer[1] += 1;
            }
            if (answers[i]==person3[i % person3.length]) {
                answer[2] += 1;
            }
        }
        int max = answer[0];
        if (max < answer[1]) max=answer[1];
        if (max < answer[2]) max=answer[2];
        if(max == answer[0] && max == answer[1] && max == answer[2]) return new int[]{1,2,3};
        else if(max == answer[0] && max == answer[1]) return new int[]{1,2};
        else if(max == answer[0] && max == answer[2]) return new int[]{1,3};
        else if(max == answer[1] && max == answer[2]) return new int[]{2,3};
        else if(max == answer[0]) return new int[]{1};
        else if(max == answer[1]) return new int[]{2};

        return new int[]{3};

    }
}
