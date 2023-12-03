import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Integer> scores = new ArrayList<>();
        for (int[] s : score) {
            scores.add(s[0] + s[1]);
        }
        scores.sort(Comparator.reverseOrder());
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            answer[i] = scores.indexOf(score[i][0] + score[i][1]) + 1;
        }
        return answer;
    }
}