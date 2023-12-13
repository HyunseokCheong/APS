class Solution {
    public String[] solution(String[] picture, int k) {
        int r = picture.length;
        int c = picture[0].length();
        String[] answer = new String[r * k];
        for (int i = 0; i < r * k; i++) {
            String origin = picture[i / k];
            String temp = "";
            for (int j = 0; j < c; j++) {
                for (int l = 0; l < k; l++) {
                    temp += origin.charAt(j);
                }
            }
            answer[i] = temp;
        }
        return answer;
    }
}