class Solution {
    public String[] solution(String[] str_list) {
        int dir = 0;
        int idx = -1;
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                dir = -1;
                idx = i;
                break;
            }
            if (str_list[i].equals("r")) {
                dir = 1;
                idx = i;
                break;
            }
        }
        if (dir == 0) {
            return new String[] {};
        }
        if (dir == -1) {
            String[] answer = new String[idx];
            for (int i = 0; i < idx; i++) {
                answer[i] = str_list[i];
            }
            return answer;
        }
        int answerLength = str_list.length - idx - 1;
        String[] answer = new String[answerLength];
        for (int i = 0; i < answerLength; i++) {
            answer[i] = str_list[i + idx + 1];
        }
        return answer;
    }
}