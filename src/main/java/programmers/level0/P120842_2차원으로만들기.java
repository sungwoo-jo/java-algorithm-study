package main.java.programmers.level0;

import java.util.Arrays;

public class P120842_2차원으로만들기 {
    // 프로그래머스 제출용
    static class Solution {
        public int[][] solution(int[] num_list, int n) {
            int[][] answer = new int[num_list.length/n][n]; // 결과 배열 선언
            int count = 0;

            for(int i = 0; i < num_list.length / n; i++) { // 행
                for(int j = 0; j < n; j++) { // 열
                    answer[i][j] = num_list[count];
                    count++;
                }
            }
            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n = 3;

        System.out.println(Arrays.toString(sol.solution(num_list, n)));
    }
}

