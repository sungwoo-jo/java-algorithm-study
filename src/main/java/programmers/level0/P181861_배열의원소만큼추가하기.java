package main.java.programmers.level0;

import java.util.ArrayList;

public class P181861_배열의원소만큼추가하기 {
    // 프로그래머스 제출용
    static class Solution {
        public ArrayList<Integer> solution(int[] arr) {
            ArrayList<Integer> answer = new ArrayList<>();

            for (int a : arr) {
                for(int i=0; i<a; i++) {
                    answer.add(a);
                }
            }

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int[] arr = {6,6};

        System.out.println(sol.solution(arr));
    }
}

