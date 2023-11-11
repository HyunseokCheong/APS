class Solution {
    public String solution(int age) {
        String answer = "";
        String planet = "abcdefghij";
        String[] arr = String.valueOf(age).split("");
        for (String a : arr) {
            answer += planet.charAt(Integer.valueOf(a));
        }
        return answer;
    }
}