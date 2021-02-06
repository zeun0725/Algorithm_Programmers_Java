package com.programmers.hash;
//위장
import java.util.*;
public class Hash2 {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> counter = new HashMap<>();
        for(String[] clothe : clothes){
            Integer preValue = counter.get(clothe[1]);
            counter.put(clothe[1],preValue == null ? 1 : preValue+1);

        }
        for(Integer val : counter.values()){
            if(answer == 0){
                answer = (val +1);
            }
            else{
                answer = answer * (val +1);
            }
        }
        return answer-1;
    }
}

