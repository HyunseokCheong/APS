class Solution {
    public boolean solution(int x) {
        String s = String.valueOf(x);
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += Integer.valueOf(c - '0');
        }
        return x % sum == 0 ? true : false;
    }
}