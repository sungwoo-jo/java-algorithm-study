package main.java.programmers.level0;

import java.util.ArrayList;

public class P181901_배열만들기1 {
    static class Solution {
        public ArrayList<Integer> solution(int n, int k) {
            ArrayList<Integer> answer = new ArrayList<>();

            for(int i=1; i<=n; i++) {
                if(i % k == 0) {
                    answer.add(i);
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int n = 15;
        int k = 5;

        System.out.println(sol.solution(n, k));
    }
}

