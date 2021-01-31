// 타켓 넘버
package com.programmers.dfs_bfs;
import java.util.Arrays;
public class DfsBfs1 {
    public int get_value(int[] numbers, int value, int target){
        if(numbers.length == 0){
            if(value==target){
                return 1;
            }
            return 0;
        }
        return get_value(Arrays.copyOfRange(numbers, 1, numbers.length), value + numbers[0], target) + get_value(Arrays.copyOfRange(numbers, 1, numbers.length), value-numbers[0], target);
    }
    public int solution(int[] numbers, int target) {

        return get_value(Arrays.copyOfRange(numbers, 1, numbers.length), numbers[0], target) + get_value(Arrays.copyOfRange(numbers, 1, numbers.length), -numbers[0], target);
    }

}
