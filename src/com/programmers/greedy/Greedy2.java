package com.programmers.greedy;

public class Greedy2 {
    public int changeStrCount(String name, int answer) {
        for(int idx = 0; idx < name.length(); idx++) {
            if((byte)name.charAt(idx) - 65 < 90 - (byte)name.charAt(idx))
                answer += (byte)name.charAt(idx) - 65;
            else
                answer += 90 - (byte)name.charAt(idx);
        }
        return answer;
    }

    public int getDirectionCount(String stand, StringBuilder name, int direct, int idx) {
        int answer = 0;

        while(!stand.equals(name.toString())){
            idx += direct;
            answer += Math.abs(direct);
            if (direct==-1 && idx<0)
                idx = name.length()-1;
            if (direct==1 && idx >= name.length())
                idx = 0;
            if(name.charAt(idx)!='A')
                name.setCharAt(idx, 'A');
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
            System.out.println(stand+builder.toString());
            int left = getDirectionCount(stand,builder, -1, idx);
            int right = getDirectionCount(stand,builder, 1, idx);
            if (left > right)
                answer += right;
            else
                answer += left;
        }

        return answer;
    }
    public int solution(String name) {
        int answer = 0;
        answer = changeStrCount(name, answer);
        answer += getMinDirection(name);


        return answer;
    }

    public static void main(String[] args) {
        Greedy2 g = new Greedy2();
        int test = g.solution("JEROEN");
        System.out.println(test);
    }
}
