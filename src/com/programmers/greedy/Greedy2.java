package com.programmers.greedy;

class Greedy2 {
    public int changeStrCount(String name, int answer) {
        for(int idx = 0; idx < name.length(); idx++) {
            if((byte)name.charAt(idx) - 65 < 91 - (byte)name.charAt(idx))
                answer += (byte)name.charAt(idx) - 65;
            else
                answer += 91 - (byte)name.charAt(idx);
        }
        return answer;
    }

    public int getDirectionCount(String stand, StringBuilder name, int direct, int idx) {
        int answer = 0;

        while(!stand.equals(name.toString())){
            idx += direct;
            answer += Math.abs(direct);
            if ( idx<0)
                idx = name.length()-1;
            if (idx >= name.length())
                idx = 0;
            if(name.charAt(idx)!='A')
                break;

        }
        return answer;
    }
    public int getMinDirection(String name) {
        int answer = 0;
        int idx = 0;
        String stand = name.replaceAll("[A-Z]","A");

        StringBuilder builder = new StringBuilder(name);
        while(!stand.equals(builder.toString())) {
            builder.setCharAt(idx,'A');
            int left = getDirectionCount(stand,builder, -1, idx);
            int right = getDirectionCount(stand,builder, 1, idx);
            if (left >= right) {
                answer += right;
                if(idx+right >= name.length()){
                    right = (idx+right)-name.length();
                    idx = right;
                }
                else
                    idx += right;
            }
            else {
                answer += left;
                if(idx-left<0) {
                    left = name.length() + (idx - left);
                    idx = left;
                }
                else
                    idx-=left;
            }
        }

        return answer;
    }
    public int solution(String name) {
        int answer = 0;
        answer = changeStrCount(name, answer);
        System.out.println(answer);
        answer += getMinDirection(name);

        return answer;
    }
}