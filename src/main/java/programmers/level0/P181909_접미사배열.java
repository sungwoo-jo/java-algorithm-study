package main.java.programmers.level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P181909_접미사배열 {
    // 프로그래머스 제출용
    static class Solution {
        public List<String> solution(String my_string) {
            List<String> answer = new ArrayList<>();

            for (int i=0; i < my_string.length(); i++) {
                answer.add(my_string.substring(my_string.length() - i - 1));
            }

            Collections.sort(answer);

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        String my_string = "prog";

        System.out.println(sol.solution(my_string)); // 배열 출력 시 Arrays.toString() 을 사용
    }
}
