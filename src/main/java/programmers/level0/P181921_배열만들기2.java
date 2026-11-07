package main.java.programmers.level0;

import java.util.ArrayList;

public class P181921_배열만들기2 {
    // 프로그래머스 제출용
    static class Solution {
        public ArrayList<Integer> solution(int l, int r) {
            ArrayList<Integer> answer = new ArrayList<>();

            for(int i=l; i<=r; i++) {
                boolean isValid = true;
                String str = String.valueOf(i);
                for (char c : str.toCharArray()) {
                    if(c != '0' && c != '5') {
                        isValid = false;
                        break;
                    }
                }
                if(isValid) {
                    answer.add(Integer.parseInt(str));
                }
            }

            if(answer.size() < 1) {
                answer.add(-1);
            }

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int l = 10;
        int r = 20;

        System.out.println(sol.solution(l, r));
    }
}

