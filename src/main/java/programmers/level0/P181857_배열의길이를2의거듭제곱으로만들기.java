package main.java.programmers.level0;

import java.util.ArrayList;

public class P181857_배열의길이를2의거듭제곱으로만들기 {
    // 프로그래머스 제출용
    static class Solution {
        public ArrayList<Integer> solution(int[] arr) {

            ArrayList<Integer> answer = new ArrayList<>();
            double targetNum = 0;

            // 거듭제곱 메서드: Math.pow(밑,지수)
            // 제시된 제한사항 중 arr의 길이가 1000보다 작기 때문에 10승(1024)까지만 확인
            for(int i = 0; i < 11; i++) {
                if (Math.pow(2, i) >= arr.length) {
                    targetNum = Math.pow(2, i);
                    break;
                }
            }

            for(int i = 0; i < arr.length; i++) {
                answer.add(arr[i]);
            }

            if(arr.length < targetNum) {
                int i = 0;
                for(; i < targetNum - arr.length; i++) {
                    answer.add(0);
                }
            }

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int[] arr = {1};
        System.out.println("arr.length: " + arr.length);

        System.out.println(sol.solution(arr));
    }
}

