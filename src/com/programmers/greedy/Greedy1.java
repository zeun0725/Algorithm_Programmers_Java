// 체육복
// https://programmers.co.kr/learn/courses/30/lessons/42862?language=java#
package com.programmers.greedy;

import java.util.*;
import java.util.stream.Collectors;

public class Greedy1 {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lost_list = new ArrayList<>();
        List<Integer> reserve_list = Arrays.stream(reserve).boxed().collect(Collectors.toList());

        for(int idx=0; idx<lost.length; idx++){
            if(reserve_list.contains(lost[idx])){
                reserve_list.remove(new Integer(lost[idx]));
                continue;
            }
            lost_list.add(lost[idx]);
        }
        for(int l:lost_list){
            if(reserve_list.contains(l-1)){

                reserve_list.remove(new Integer(l-1));
                continue;
            }
            if(reserve_list.contains(l+1)){
                reserve_list.remove(new Integer(l+1));
                continue;
            }
            n--;

        }
        return n;
    }

}
