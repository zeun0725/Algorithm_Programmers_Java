// 체육복
// https://programmers.co.kr/learn/courses/30/lessons/42862?language=java#
package com.programmers.greedy;

import java.util.*;
import java.util.stream.Collectors;

public class Greedy1 {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lost_list = new ArrayList<>();
        List<Integer> reserve_list = Arrays.stream(reserve).boxed().collect(Collectors.toList());

        for(int i: lost){
            if(reserve_list.contains(i)){
                reserve_list.remove(Integer.valueOf(i));
                continue;
            }
            lost_list.add(i);
        }

        for(int l:lost_list){
            if(reserve_list.contains(l-1)){

                reserve_list.remove(Integer.valueOf(l - 1));
                continue;
            }
            if(reserve_list.contains(l+1)){
                reserve_list.remove(Integer.valueOf(l + 1));
                continue;
            }
            n--;

        }
        return n;
    }

}
