// H-Index
package com.programmers.sort;

import java.util.Arrays;

public class Sort2 {
    public int getIndex(int[] citations, int hIdx) {
        int Idx = citations.length - 1;
        for(int idx=0 ; idx < citations.length; idx++) {
            if (citations[idx] >= hIdx) {
                Idx = idx;
                break;
            }
        }
        return Idx;

    }
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int hIdx = 0;
        int Idx = 0;
        int len = citations.length;
        while (citations[Idx] >= hIdx && len - Idx >= hIdx) {
            hIdx++;
            Idx = getIndex(citations, hIdx);

        }
        return hIdx - 1;
    }
}
