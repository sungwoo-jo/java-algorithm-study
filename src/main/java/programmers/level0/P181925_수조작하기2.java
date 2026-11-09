package main.java.programmers.level0;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181925_수조작하기2 {
    // 프로그래머스 제출용
    static class Solution {
        public String solution(int[] numLog) {
            String answer = "";

            for(int i=1; i<numLog.length; i++) {
                if (numLog[i-1] < numLog[i]) { // 이전값이 더 작은 경우(+)
                    if (numLog[i-1] + 1 == numLog[i]) { // 1 차이
                        answer += 'w';
                    } else {
                        answer += 'd';
                    }
                } else { // 이후값이 더 작은 경우(-)
                    if (numLog[i-1] - 1 == numLog[i]) { // 1 차이
                        answer += 's';
                    } else {
                        answer += 'a';
                    }
                }
            }

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};

        System.out.println(sol.solution(numLog));
    }
}

