package main.java.programmers.level0;

import java.util.*;

public class P12906_같은숫자는싫어 {
    // 프로그래머스 제출용
    static class Solution {
        public int[] solution(int[] arr) {
            Deque<Integer> stack = new ArrayDeque<>();

            for (int a : arr) {
                if (stack.isEmpty()) {
                    stack.push(a);
                }
                if (stack.peek() != a) {
                    stack.push(a);
                }
            }

            int[] answer = new int[stack.size()];

            for(int i=answer.length-1; i>=0; i--) {
                answer[i] = stack.getFirst();
                stack.pop();
            }

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int[] arr = {4,4,4,3,3};

        System.out.println(sol.solution(arr));
    }
}

