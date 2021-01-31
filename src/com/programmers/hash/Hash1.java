package com.programmers.hash;
import java.util.*;
//완주하지 못한 선수
public class Hash1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int com_len = completion.length;
        for(int idx = 0 ; idx < com_len ; idx++){
            if(!participant[idx].equals(completion[idx])){
                return participant[idx];
            }
        }
        return participant[com_len];
    }
}
