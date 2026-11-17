package main.java.programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class P181858_무작위로K개의수뽑기 {
    // 프로그래머스 제출용
    static class Solution {
        public List<Integer> solution(int[] arr, int k) {
            List<Integer> answer = new ArrayList<>();
            int count = 0;

            for (int i=0; i<arr.length; i++) {
                if (count < k) {
                    if (!answer.contains(arr[i])) {
                        answer.add(arr[i]);
                        count += 1;
                    }
                }
            }

            int loopCnt = k-answer.size();

            for (int i=0; i<loopCnt; i++) {
                answer.add(-1);
            }

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int[] arr = {0, 1, 1, 1, 1};
        int k = 4;

        System.out.println(sol.solution(arr, k));
    }
}

