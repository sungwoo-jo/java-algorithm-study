package main.java.programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class P181893_배열조각하기 {
    // 프로그래머스 제출용
    static class Solution {
        public List<Integer> solution(int[] arr, int[] query) {
            List<Integer> answer = new ArrayList<>(); // 배열 리스트 생성

            for (int a : arr) {
                answer.add(a); // 배열 리스트에 배열 값 넣기
            }

            for (int i = 0; i < query.length; i++) {
                if (i % 2 == 0) { // 짝수 인덱스
                    answer = answer.subList(0, query[i]+1); // 배열 리스트에선 subList를 이용해 인덱스를 가져온다.
                } else {
                    answer = answer.subList(query[i], answer.size());
                }
            }

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};

        System.out.println(sol.solution(arr, query));
    }
}

