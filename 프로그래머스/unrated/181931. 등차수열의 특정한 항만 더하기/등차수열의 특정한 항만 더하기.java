class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int n = included.length;
        int[] seq = new int[n];
        seq[0] = a;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                seq[i] = seq[i - 1] + d;
            }
            if (included[i]) {
                answer += seq[i];
            }
        }
        return answer;
    }
}
