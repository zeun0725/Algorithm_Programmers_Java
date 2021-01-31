package com.programmers.hash;
import java.util.*;

// 전화번호 목록
public class Hash3 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book, (x, y)->Integer.compare(x.length(), y.length()));
        boolean answer = true;
        for(int i=0; i < phone_book.length; i++){
            for(int  j=i+1; j < phone_book.length; j++){
                if(phone_book[j].startsWith(phone_book[i])){
                    return false;
                }
            }
        }
        return true;
    }
}

class Solution {

    public String solution(int[] numbers) {
        String[] nums = new String[numbers.length];

        for (int i=0; i<nums.length; i++)
            nums[i] = Integer.toString(numbers[i]);

        Arrays.sort(nums, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        String ans = "";
        for (int i=0; i<numbers.length; i++)
            ans += nums[i];

        return ans.charAt(0) == '0' ? "0" : ans;
    }
}