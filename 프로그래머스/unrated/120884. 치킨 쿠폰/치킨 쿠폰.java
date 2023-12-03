class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while (true) {
            if (chicken < 10) {
                break;
            }
            chicken -= 10;
            answer++;
            chicken++;
        }
        return answer;
    }
}