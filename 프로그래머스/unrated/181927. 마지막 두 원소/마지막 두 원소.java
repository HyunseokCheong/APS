class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int last = num_list[n - 1];
        int last_last = num_list[n - 2];
        
        int[] answer = new int[n + 1];
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        if (last > last_last) {
            answer[n] = last - last_last;
            return answer;
        }
        answer[n] = last * 2;
        return answer;
    }
}
