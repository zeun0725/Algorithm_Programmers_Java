package com.company.hash;
import java.util.*;

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
