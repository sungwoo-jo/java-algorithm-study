package main.java.programmers.level0;

import java.util.HashMap;
import java.util.Map;

public class P1845_폰켓몬 {
    // 프로그래머스 제출용
    static class Solution {
        public int solution(int[] nums) {
            Map<Integer, Integer> pkSelect = new HashMap<>();

            for (int i=0; i< nums.length; i++) {
                pkSelect.put(nums[i], pkSelect.getOrDefault(nums[i], 0)+1);
            }

            return Math.min(nums.length/2, pkSelect.size());
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int[] nums = {3, 3, 3, 2, 2, 2};

        System.out.println(sol.solution(nums));
    }
}

