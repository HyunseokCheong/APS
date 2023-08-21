class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        
        int sum = a + b + c;
        int max = Math.max(a, Math.max(b, c));
        int answer = 1;
        if (sum - max <= max) {
            answer = 2;
        }
        return answer;
    }
}
