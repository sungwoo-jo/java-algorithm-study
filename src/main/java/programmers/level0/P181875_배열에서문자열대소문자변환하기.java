package main.java.programmers.level0;

import java.util.Arrays;

public class P181875_배열에서문자열대소문자변환하기 {
    // 프로그래머스 제출용
    static class Solution {
        public String[] solution(String[] strArr) {
            String[] answer = new String[strArr.length];

            for (int i = 0; i < answer.length; i++) {
                String tmpStr = strArr[i];
                if(i % 2 == 0) {
                    answer[i] = tmpStr.toLowerCase();
                } else {
                    answer[i] = tmpStr.toUpperCase();
                }
            }

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        String[] strArr = {"aBc","AbC"};

        System.out.println(Arrays.toString(sol.solution(strArr)));
    }
}

