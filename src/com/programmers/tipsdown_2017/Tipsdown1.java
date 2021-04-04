package com.programmers.tipsdown_2017;

import java.util.ArrayList;
import java.util.List;

public class Tipsdown1 {
    public int solution(String s) {
        if ((s.length() & 1)== 1) {
            return 0;
        }
        List<Character> stack = new ArrayList<>();
        for(int idx=0; idx < s.length(); idx++) {
            if(stack.isEmpty()) {
                stack.add(s.charAt(idx));
                continue;
            }
            int lastIdx = stack.size() - 1;
            if (stack.get(lastIdx) == s.charAt(idx)) {
                stack.remove(lastIdx);
            }
            else
                stack.add(s.charAt(idx));
        }
        if (stack.isEmpty())
            return 1;
        return 0;

    }
}
