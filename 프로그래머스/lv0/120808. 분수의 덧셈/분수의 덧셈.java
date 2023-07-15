class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int lcm = denom1 * denom2 / gcd(denom1, denom2);
        int x = lcm / denom1;
        int y = lcm / denom2;
        int[] answer = new int[2];
        answer[1] = lcm;
        answer[0] = numer1 * x + numer2 * y;
        int gcd = gcd(answer[0], answer[1]);
        answer[0] /= gcd;
        answer[1] /= gcd;
        return answer;
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
