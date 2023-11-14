class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        for (int c = 1; c < 2000; c++) {
            int a = sides[0];
            int b = sides[1];
            int max = Math.max(Math.max(a, b), c);
            int sum = a + b + c;
            if (max < sum - max) {
                answer++;
            }
        }
        return answer;
    }
}