package main.java.programmers.level0;

import java.util.HashMap;
import java.util.Map;

public class P42576_완주하지못한선수 {
    // 프로그래머스 제출용
    static class Solution {

        // 풀이 1: 정확성 테스트는 전부 통과, 효율성 테스트는 전부 실패
        public String solution1(String[] participant, String[] completion) {
            String answer = "";

            for(String c : completion) {
                for(int i=0; i<participant.length; i++) {
                    if (participant[i].equals(c)) {
                        participant[i] = participant[i].replace(c, "");
                        break;
                    }
                }
            }

            for (int i=0; i< participant.length; i++) {
                if (!participant[i].equals("")) {
                    answer = participant[i];
                }
            }

            return answer;
        }

        public String solution2(String[] participant, String[] completion) {
            String answer = "";
            Map<String, Integer> completionMap = new HashMap<>();

            // 참가자를 map에 전부 추가
            for (String p : participant) {
                completionMap.put(p, completionMap.getOrDefault(p, 0)+1);
            }

            // 완주자 확인하기
            for (String c : completion) {
                if (completionMap.containsKey(c)) { // 참가자가 완주한 경우
                    completionMap.put(c, completionMap.get(c)-1); // 카운트(value)를 감소
                    if (completionMap.get(c) == 0) { // 0이면 삭제한다
                        completionMap.remove(c);
                    }
                }
            }

            // 완주하지 못한 선수 찾기
            for (Map.Entry<String, Integer> entry : completionMap.entrySet()) {
                if (entry.getValue().equals(1)) {
                    answer = entry.getKey();
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
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

//        System.out.println(sol.solution1(participant, completion));
        System.out.println(sol.solution2(participant, completion));
    }
}

