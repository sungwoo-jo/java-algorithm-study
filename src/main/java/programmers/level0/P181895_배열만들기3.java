package main.java.programmers.level0;

import java.util.ArrayList;

public class P181895_배열만들기3 {
    // 프로그래머스 제출용
    static class Solution {
        public ArrayList<Integer> solution(int[] arr, int[][] intervals) {

            ArrayList<Integer> answer = new ArrayList<>();

            for(int[] interval : intervals) {
                int i = interval[0];
                int j = interval[1];
                for(int k=i; k<=j; k++) {
                    answer.add(arr[k]);
                }
            }

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int[] arr = {1,2,3,4,5};
        int[][] intervals = {{1,3},{0,4}};

        System.out.println(sol.solution(arr, intervals));
    }
}

