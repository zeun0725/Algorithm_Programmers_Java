package com.programmers.brute_force;

import java.util.Set;
import java.util.TreeSet;
import java.lang.Math;

public class BruteForce2 {
    Set<Integer> TreeNums = new TreeSet<>();
    public void permutations(String str, String nums, int depth){
        if(str.length() == depth){
            TreeNums.add(Integer.parseInt(str));
        }
        else{
            TreeNums.add(Integer.parseInt(str));
            for(int idx=0; idx<nums.length(); idx++){
                permutations(str+nums.charAt(idx), nums.substring(0,idx)+nums.substring(idx+1), depth+1);
            }
        }
    }

    public int solution(String numbers) {
        String[] nums = numbers.split("");
        int len = numbers.length();
        for (int idx = 0; idx < len; idx++) {
            permutations("" + numbers.charAt(idx), numbers.substring(0, idx) + numbers.substring(idx + 1, len), len);
        }
        int answer = 0;
        for (int idx : TreeNums) {
            if (idx != 2 && (idx & 1) == 0) continue;
            int div = 3;
            int value = idx;
            int sqrtNums = (int) Math.sqrt(idx);
            while (sqrtNums >= div) {
                if (idx % div == 0) {
                    value = 1;
                    break;
                }
                div += 1;
            }
            answer += (value == 1) ? 0 : 1;
        }
        return answer;
    }
}
