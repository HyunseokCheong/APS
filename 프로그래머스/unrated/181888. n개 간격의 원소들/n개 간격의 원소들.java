class Solution {
    public int[] solution(int[] num_list, int n) {
        int lengthOfAnswerArray = 0;
        if (num_list.length % n == 0) {
	        lengthOfAnswerArray = num_list.length / n;
        } else {
            lengthOfAnswerArray = num_list.length / n + 1;
        }
        int[] answer = new int[lengthOfAnswerArray];
        for (int i = 0; i < lengthOfAnswerArray; i++) {
            answer[i] = num_list[i * n];
        }
        return answer;
    }
}