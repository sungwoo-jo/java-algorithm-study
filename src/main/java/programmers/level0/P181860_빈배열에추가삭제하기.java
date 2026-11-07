package main.java.programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class P181860_빈배열에추가삭제하기 {
    // 프로그래머스 제출용
    static class Solution {
        public List<Integer> solution(int[] arr, boolean[] flag) {
            List<Integer> answer = new ArrayList<>();

            for(int i=0; i<arr.length; i++) {
                if(flag[i]) {
                    for(int j=0; j<arr[i]*2; j++) {
                        answer.add(arr[i]);
                    }
                } else {
                    answer = answer.subList(0, answer.size() - arr[i]);
                }
            }

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};

        System.out.println(sol.solution(arr, flag));
    }
}

