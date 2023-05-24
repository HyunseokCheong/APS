class Solution {
    public int solution(String myString, String pat) {
        String newPat = "";
        for (int i = 0; i < pat.length(); i++) {
            if (pat.charAt(i) == 'A') {
                newPat += "B";
            } else {
                newPat += "A";
            }
        }
        return myString.contains(newPat) ? 1 : 0;
    }
}