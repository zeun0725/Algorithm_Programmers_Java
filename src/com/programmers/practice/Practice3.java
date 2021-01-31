package com.programmers.practice;

public class Practice3 {
    public String solution(String s) {
        String answer;
        int div = s.length()/2;
        if((s.length()&1)==1){
            answer = s.substring(div,div+1);
        }
        else{
            answer = s.substring(div-1,div+1);
        }
        return answer;
    }
}
