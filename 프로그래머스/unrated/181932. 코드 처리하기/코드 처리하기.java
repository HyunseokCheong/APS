class Solution {
    public String solution(String code) {
        String result = "";
        boolean mode = false;
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') {
                mode = !mode;
                continue;
            }
            if (!mode && i % 2 == 0) {
                result += c;
                continue;
            }
            if (mode && i % 2 != 0) {
                result += c;
                continue;
            }
        }
        if (result == "") {
            result = "EMPTY";
        }
        return result;
    }
}