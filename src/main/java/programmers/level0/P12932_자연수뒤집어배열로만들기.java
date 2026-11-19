package main.java.programmers.level0;

import java.util.Arrays;

public class P12932_자연수뒤집어배열로만들기 {
    // 프로그래머스 제출용
    static class Solution {
        public int[] solution(int n) {
            String[] str = String.valueOf(n).split("");
            int[] answer = new int[str.length];

            for (int i=0; i<str.length; i++) {
                answer[i] = Integer.parseInt(str[str.length-1-i]);
            }

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int n = 12345;

        System.out.println(sol.solution(n));
    }
}

