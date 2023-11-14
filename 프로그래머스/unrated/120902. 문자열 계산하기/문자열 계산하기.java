class Solution {
    public int solution(String my_string) {
        String[] split = my_string.split(" ");
        int answer = 0;
        for (int i = 0; i < split.length; i++) {
            if (i == 0) {
                answer += Integer.parseInt(split[i]);
            }
            if (i != 0 && split[i].equals("+")) {
                answer += Integer.parseInt(split[++i]);
            }
            if (i != 0 && split[i].equals("-")) {
                answer -= Integer.parseInt(split[++i]);
            }
        }
        return answer;
    }
}