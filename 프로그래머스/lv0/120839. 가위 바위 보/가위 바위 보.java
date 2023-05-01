class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for (int i = 0; i < rsp.length(); i++) {
            char cur = rsp.charAt(i);
            String ret = "";
            if (cur == '2') {
                ret = "0";
            } else if (cur == '0') {
                ret = "5";
            } else {
                ret = "2";
            }
            answer += ret;
        }
        
        return answer;
    }
}