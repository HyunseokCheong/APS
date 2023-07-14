class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for (int number : box) {
            answer *= number / n;
        }
        return answer;
    }
}
