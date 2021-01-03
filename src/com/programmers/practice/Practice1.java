import java.util.*;

package com.programmers.practice;

public class Practice1 {
    public int[] solution(int []arr) {
        List<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        int preNum = arr[0];
        for(int a:arr){
            if(preNum != a){
                ans.add(a);
                preNum = a;
            }
        }
        int[] answer = new int[ans.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
}
