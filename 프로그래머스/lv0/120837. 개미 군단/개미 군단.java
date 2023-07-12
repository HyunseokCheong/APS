class Solution {
    public int solution(int hp) {
        // 5 3 1
        int ant1 = 5;
        int ant2 = 3;
        int ant3 = 1;
        int sum = 0;
        
        while (hp >= ant1) {
            hp -= ant1;
            sum++;
        }
        while (hp >= ant2) {
            hp -= ant2;
            sum++;
        }
        while (hp >= 1) {
            hp -= ant3;
            sum++;
        }
        return sum;
    }
}
