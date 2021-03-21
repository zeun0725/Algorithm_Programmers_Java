// 문자열 압축
package com.programmers.kakao_2020;
import java.util.*;
public class Kakao1 {
    public String getNewStr(List<String> strList) {
        int init_cnt = 1;
        String new_s = "";
        int i = -1;
        for(String s1: strList) {
            i ++;
            if(i < strList.size()-1 && strList.get(i).equals(strList.get(i+1))) {
                init_cnt += 1;
                continue;
            }
            if(init_cnt > 1){
                new_s += Integer.toString(init_cnt);
            }
            new_s += s1;
            init_cnt = 1;
        }
        return new_s;
    }

    public int solution(String s) {
        int sLength = s.length();
        int answer = sLength;
        for(int idx = 1; idx < sLength/2+1; idx++) {
            List<String> strList = new ArrayList<>();
            for(int j = 0; j < sLength ; j+=idx) {
                if( j + idx >= sLength)
                    strList.add(s.substring(j,sLength));
                else
                    strList.add(s.substring(j,j+idx));
            }
            String new_s = getNewStr(strList);
            if(new_s.length() < answer){
                answer = new_s.length();
            }
        }
        return answer;
    }

}
