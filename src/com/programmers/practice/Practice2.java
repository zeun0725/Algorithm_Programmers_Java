package com.programmers.practice;
import java.util.*;
public class Practice2 {
    public int[] solution(int []arr) {
        List<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        int ans_idx = 0;
        for(int  idx=1;  idx<arr.length; idx++){
            if(ans.get(ans.size()-1) != arr[idx]){
                ans.add(arr[idx]);
            }
        }
        int[] answer = new int[ans.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
}
