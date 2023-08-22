class Solution {
    /**
     * myString의 부분 문자열 중 pat로 끝나는 가장 긴 부분 문자열
     * 부분 문자열이 등장하는 가장 마지막 위치 찾기
     *
     * @param myString String
     * @param pat String
     * @return subString String
     */
    public String solution(String myString, String pat) {
        // Initialize substring to be an empty string
        String subString = "";
        int idx = myString.lastIndexOf(pat);

        if (idx != -1) {
            subString = myString.substring(0, idx + pat.length());
        }

        return subString;
    }
}
