package main.java.programmers.level0;

import java.util.ArrayList;

public class P181912_배열만들기5 {
    // 프로그래머스 제출용
    static class Solution {
        public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
            ArrayList<Integer> answer = new ArrayList<>();

            for (String strs : intStrs) {
                String beforeStrs = strs.substring(s); // substring 을 사용하여 s 인덱스 이후 값을 가져온다
                beforeStrs = beforeStrs.substring(0, l);
                int afterStrs =  Integer.parseInt(beforeStrs);
                if(afterStrs > k) {
                    answer.add(afterStrs);
                }
            }

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;

        System.out.println(sol.solution(intStrs, k, s, l));
    }
}

