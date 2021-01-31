package com.programmers.sort;
import java.util.*;
public class Sort1 {
    int getValue(int[] array, int[] command){
        List<Integer> arr = new ArrayList<>();
        for(int idx=command[0]-1; idx<command[1]; idx++){
            arr.add(array[idx]);
        }
        Collections.sort(arr);
        return arr.get(command[2]-1);
    }
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int ansIdx = 0;
        for(int[] command:commands){
            answer[ansIdx] = getValue(array, command);
            ansIdx++;
        }
        return answer;
    }
}
