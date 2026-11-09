package main.java.programmers.level0;

import java.util.*;

public class P181851_전국대회선발고사 {
    // 프로그래머스 제출용
    static class Solution {
        public int solution(int[] rank, boolean[] attendance) {
            Map<Integer, Integer> tmpMap = new HashMap<>(); // 키: 등수, 값: 인덱스
            int answer = 0;

            for(int i=0; i < rank.length; i++) {
                if (attendance[i]) {
                    tmpMap.put(rank[i], i);
                }
            }

            List<Integer> keySet = new ArrayList<>(tmpMap.keySet());
            Collections.sort(keySet);
            answer = tmpMap.get(keySet.get(0)) * 10000 + tmpMap.get(keySet.get(1)) * 100 + tmpMap.get(keySet.get(2));

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int[] rank = {6, 1, 5, 2, 3, 4};
        boolean[] attendance = {true, false, true, false, false, true};

        System.out.println(sol.solution(rank, attendance));
    }
}

