package com.programmers.test;

class Solution{
    public int UD_Count(char c) {//위 아래
        int ud_count=0;
        int upcount = 0; int downcount=0;
        upcount = c-'A';
        downcount = 'Z'-c+1;

        ud_count = (upcount < downcount) ? upcount: downcount;

        if(c-'A' == 13) ud_count = 13;

        return ud_count;
    }

    public int Right_Count(String name, int i) { // 우측 이동
        int rightcount=0;

        int r = i+1;
        while(r != i ) {
            if(r == name.length()) r = 0;
            if(r == i)break;

            ++rightcount;
            if(name.charAt(r) != 'A')break;
            r++;

        }
        return rightcount;
    }

    public int Left_Count(String name, int i) { //좌측이동
        int leftcount =0;

        int l;
        if(i == 0) l = name.length() -1;
        else l = i-1;

        while(l != i) {
            if(l == i) break;
            ++leftcount; // 이 때 j의 칸으로 가게된 것
            if(name.charAt(l) != 'A') { break;}
            l--;
            if(l == -1) l = name.length() -1;
        }
        return leftcount;
    }


    public int solution(String name) {
        int answer=0; int i=0;

        StringBuilder builder = new StringBuilder(name);
        for(int idx=0; idx<name.length(); idx++) {
            if(name.charAt(idx) != 'A'){builder.setCharAt(idx, 'A');
            }}//builder = "AAA"

        String s = builder.toString();

        if(name.charAt(0) != 'A') {
            answer = answer + UD_Count(name.charAt(0));
            builder.setCharAt(i, name.charAt(0));
        }
        s = builder.toString();
        int lcount =0; int rcount = 0;

        lcount = Left_Count(name,i);
        rcount = Right_Count(name,i);

        if(lcount < rcount ) { // 이방향으로 계산. 다시 반대로 가는건 볼 필요 없음
            while(s.equals(name) ==false) {
                //i값 변경해줌
                if(i-lcount <0) i=name.length() +i- lcount;
                else i = i-lcount;

                answer= answer + lcount;
                if(name.charAt(i) != 'A') {
                    answer = answer + UD_Count(name.charAt(i));
                    builder.setCharAt(i, name.charAt(i));
                }
                s = builder.toString();
                if(s.equals(name) == true) break;
            }
        }
        else {
            while(s.equals(name)==false) {
                if(i+rcount >= name.length()) {i = (i+rcount)-(name.length()-1)-1;}
                else i = i+rcount;

                answer = answer+rcount;
                if(name.charAt(i) != 'A') {
                    answer = answer + UD_Count(name.charAt(i));
                    builder.setCharAt(i, name.charAt(i));
                }
                s = builder.toString();
                if(s.equals(name) == true) break;
            }}

        return answer;

    }
}