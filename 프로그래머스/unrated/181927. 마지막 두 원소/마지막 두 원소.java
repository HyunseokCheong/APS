class Solution {
    
    public int[] solution(int[] num_list) {
        int lengthOfNumList = num_list.length;
        int addNumber;
        if (num_list[lengthOfNumList - 1] > num_list[lengthOfNumList - 2]) {
            addNumber = num_list[lengthOfNumList - 1] - num_list[lengthOfNumList - 2];
        } else {
            addNumber = num_list[lengthOfNumList - 1] * 2;
        }
        
        int[] answer = new int[lengthOfNumList + 1];
        for (int i = 0; i < lengthOfNumList; i++) {
            answer[i] = num_list[i];
        }
        answer[lengthOfNumList] = addNumber;
        return answer;
    }
}