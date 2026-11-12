package main.java.programmers.level0;

import java.util.*;

public class P181916_주사위게임3 {
    // 프로그래머스 제출용
    static class Solution {
        public int solution(int a, int b, int c, int d) {
            int answer = 0; // 리턴값
            Map<Integer, Integer> map = new HashMap<>();
            map.put(a, map.getOrDefault(a, 0) + 1);
            map.put(b, map.getOrDefault(b, 0) + 1);
            map.put(c, map.getOrDefault(c, 0) + 1);
            map.put(d, map.getOrDefault(d, 0) + 1);

            // 사이즈가 1인 경우
            // 1. 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
            if (map.size() == 1) {
                answer = 1111 * a;
            // 사이즈가 2인 경우
            // 2. 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
            // 사이즈가 2인 경우는 1113 또는 1133과 같이 세 개의 값이 같거나 두 개의 값이 같은 경우이다.
            } else if (map.size() == 2) { // 값 3개 또는 2개가 같은 숫자인 경우
                if (map.containsValue(3)) { // 값 3개가 같은 숫자인 경우
                    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                        if(entry.getValue() == 3) { // 세번 나온 숫자
                            answer += 10 * entry.getKey();
                        } else { // 한번 나온 숫자
                            answer += entry.getKey();
                        }
                    }
                    answer *= answer;
                } else if (map.containsValue(2)) { // 값 2개씩 같은 숫자인 경우
                    int minNum = Collections.min(map.keySet()); // 작은 수
                    int maxNum = Collections.max(map.keySet()); // 작은 수
                    answer += (minNum + maxNum) * Math.abs(maxNum-minNum);
                }
            } else if (map.size() == 3) { // 값 2개가 같고 나머지 2개가 다를 때
                answer = 1;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() == 1) {// 한 번 나온 숫자끼리만 곱한다. (value가 1)
                        answer *= entry.getKey();
                    }
                }
            } else {
                answer = Collections.min(map.keySet());
            }

            return answer;
        }
    }

    // 출력 결과 확인용
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트를 위한 입출력 데이터
        int a=6;
        int b=4;
        int c=2;
        int d=5;

        System.out.println(sol.solution(a, b, c, d));
    }
}

