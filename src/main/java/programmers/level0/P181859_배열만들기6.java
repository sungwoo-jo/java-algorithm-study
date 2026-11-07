package main.java.programmers.level0;

import java.util.Stack;

public class P181859_배열만들기6 {
    // 프로그래머스 제출용
    static class Solution {
        public Stack<Integer> solution(int[] arr) {
            Stack<Integer> answer = new Stack<>(); // 스택으로 생성

            for(int i=0; i<arr.length; i++) {
                if (answer.isEmpty()) {
                    answer.push(arr[i]);
                } else {
                    if (answer.peek() == arr[i]) {
                        answer.pop();
                    } else {
                        answer.push(arr[i]);
                    }
                }
            }

            if (answer.isEmpty()) answer.push(-1);
            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int[] arr = {0, 1, 1, 0};

        System.out.println((sol.solution(arr)));
    }
}

