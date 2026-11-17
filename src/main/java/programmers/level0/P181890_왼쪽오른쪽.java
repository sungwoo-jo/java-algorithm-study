package main.java.programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class P181890_왼쪽오른쪽 {
    // 프로그래머스 제출용
    static class Solution {
        public List<String> solution(String[] str_list) {
            List<String> answer = new ArrayList<>();

            for (int i=0; i<str_list.length; i++) {
                if (str_list[i].equals("l")) {
                    for (int j=0; j<i; j++) {
                        answer.add(str_list[j]);
                    }
                    break;
                } else if (str_list[i].equals("r")) {
                    for (int j=i+1; j< str_list.length; j++) {
                        answer.add(str_list[j]);
                    }
                    break;
                }
            }

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        String[] str_list = {"u", "u", "r", "d", "d"};

        System.out.println(sol.solution(str_list));
    }
}

