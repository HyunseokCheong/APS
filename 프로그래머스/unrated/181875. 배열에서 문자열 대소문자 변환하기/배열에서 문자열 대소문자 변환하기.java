class Solution {
    public String[] solution(String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i % 2 != 0) {
                strArr[i] = strArr[i].toUpperCase();
            } else {
                strArr[i] = strArr[i].toLowerCase();
            }
        }
        return strArr;
    }
}