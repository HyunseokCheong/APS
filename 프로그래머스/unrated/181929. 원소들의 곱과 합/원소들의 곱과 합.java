class Solution {
    public int solution(int[] num_list) {
        int sumOfMulti = 1;
        int sumOfPlus = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            sumOfMulti *= num_list[i];
            sumOfPlus += num_list[i];
        }
        
        return sumOfMulti < sumOfPlus * sumOfPlus ? 1 : 0;
    }
}