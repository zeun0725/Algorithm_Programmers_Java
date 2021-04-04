package com.programmers.kakao_2020;

import java.util.ArrayList;
import java.util.List;

public class Kakao2 {
    public boolean isRightStr(String p) {
        List<Character> stack = new ArrayList<>();
        for(int idx=0; idx < p.length(); idx++) {
            if (p.charAt(idx) == '(') {
                stack.add(p.charAt(idx));
                continue;
            }
            if (!stack.isEmpty()) {
                stack.remove(stack.size()-1);
            }
            else
                return false;
        }
        return true;
    }
    public List<String> getBalcStr(String p) {
        List<String> uvList = new ArrayList<>();
        for(int idx=2; idx<=p.length(); idx+=2) {
            String sub = p.substring(0,idx);
            int lCount = 0;
            int rCount = 0;
            for (int i=0; i<sub.length(); i++) {
                if(sub.charAt(i) == '(')
                    lCount++;
                else
                    rCount++;
            }
            if (lCount == rCount) {
                uvList.add(sub);
                uvList.add(p.substring(idx));
                break;
            }
        }
        return uvList;
    }

    public String setRightU(String u) {
        String newU = "";
        for(int idx=1; idx < u.length() -1; idx++) {
            if (u.charAt(idx) == '(')
                newU += ')';
            else
                newU += '(';
        }
        return newU;
    }
    public String solution(String p) {
        if (p.equals(""))
            return p;
        String answer = "";
        if (isRightStr(p))
            return p;
        List<String> uvList = getBalcStr(p);
        String u = uvList.get(0);
        String v = uvList.get(1);

        if (isRightStr(u))
            answer += u + solution(v);
        else {
            u = setRightU(u);
            answer += '(' + solution(v) + ')' + u;
        }

        return answer;
    }
}