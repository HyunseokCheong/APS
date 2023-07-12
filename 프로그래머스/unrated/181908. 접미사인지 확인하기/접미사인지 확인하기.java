class Solution {
    public int solution(String my_string, String is_suffix) {
        if (my_string.length() < is_suffix.length()) {
            return 0;
        }
        // 문자열 뒤집기
        String reversed_my_string = new StringBuilder(my_string).reverse().toString();
        String reversed_is_suffix = new StringBuilder(is_suffix).reverse().toString();
        
        // 문자열 비교
        if (reversed_my_string.startsWith(reversed_is_suffix)) {
            return 1;
        } else {
            return 0;
        }
    }
}
