//더 맵게
/*
우선순위 큐 사용
peek() : 값이 있는 지 확인, 값이 없으면 null 반환
offer(value) : 값 넣음
poll() : 값 반환 후 제거, 비어있으면 null 반환
 */
package com.programmers.heap;
import java.util.*;
public class Heap1 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> foodQueue = new PriorityQueue<>();
        for(int sco : scoville){
            foodQueue.offer(sco);
        }
        while(foodQueue.size() > 1 && foodQueue.peek() < K) {
            int first = foodQueue.poll();
            int second = foodQueue.poll();
            foodQueue.offer(first + (second * 2));
            answer += 1;
        }
        if(foodQueue.peek() < K){
            return -1;
        }
        return answer;
    }
}
