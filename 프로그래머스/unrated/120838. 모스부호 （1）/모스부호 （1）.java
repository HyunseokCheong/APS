class Solution {
    public String solution(String letter) {
        String result = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};

        String[] words = letter.split(" ");
        for (String word : words) {
            for (int i = 0; i < morse.length; i++) {
                if (word.equals(morse[i])) {
                    result += Character.toString((char) (i + 'a'));
                    break;
                }
            }
        }
        return result;
    }
}
