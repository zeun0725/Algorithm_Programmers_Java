package com.programmers.stack_queue;
import java.util.*;
import java.util.stream.Collectors;

public class StackQueue1 {
    public int setLocation(List<Integer> list, int location){
        if(location == 0)
            location = list.size()-1;
        else
            location -= 1;
        return location;
    }
    public int solution(int[] priorities, int location) {
        List<Integer> list = Arrays.stream(priorities).boxed().collect(Collectors.toList());
        int answer = 1;

        while(!list.isEmpty()) {
            Integer idx = list.get(0);
            if (idx == Collections.max(list)){
                if(location == 0)
                    break;
                else {
                    list.remove(0);
                    location = setLocation(list, location);
                    answer += 1;
                    continue;
                }
            }
            list.remove(0);
            list.add(idx);
            location = setLocation(list, location);

        }
        return answer;
    }
}
