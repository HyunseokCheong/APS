import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> rankIndex = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            rankIndex.put(rank[i], i);
        }
        int count = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 1; i < rank.length + 1; i++) {
            if (count == 3) {
                break;
            }
            int value = rankIndex.get(i);
            if (attendance[value] && count == 0) {
                a = value;
                count++;
                continue;
            }
            if (attendance[value] && count == 1) {
                b = value;
                count++;
                continue;
            }
            if (attendance[value] && count == 2) {
                c = value;
                count++;
            }
        }
        int answer = a * 10000 + b * 100 + c;
        return answer;
    }
}