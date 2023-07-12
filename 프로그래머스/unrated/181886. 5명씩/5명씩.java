class Solution {
    public String[] solution(String[] names) {
        int length = names.length;
        int answer_length;
        if (length % 5 == 0) {
            answer_length = length / 5;
        } else {
            answer_length = length / 5 + 1;
        }
        String[] answer = new String[answer_length];
        int index = 0;
        for (int i = 0; i < length; i += 5) {
            answer[index] = names[i];
            index++;
        }
        
        return answer;
    }
}