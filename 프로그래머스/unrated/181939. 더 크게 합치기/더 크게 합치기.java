class Solution {
    public int solution(int a, int b) {
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        int sum1 = Integer.parseInt(s1 + s2);
        int sum2 = Integer.parseInt(s2 + s1);
        return sum1 >= sum2 ? sum1 : sum2;
    }
}