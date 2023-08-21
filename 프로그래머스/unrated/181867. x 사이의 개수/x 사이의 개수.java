class Solution {
    public int[] solution(String myString) {
        String[] split = myString.split("x");
        int n = split.length;
        if (myString.charAt(myString.length() - 1) == 'x') {
            n++;
        }
        int[] answer = new int[n];
        for (int i = 0; i < split.length; i++) {
            answer[i] = split[i].length();
        }
        return answer;
    }
}
