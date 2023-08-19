class Solution {
    public int solution(int a, int b) {
        int sum1, sum2, answer;

        // int -> string
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);

        // string + string
        String strSum1 = strA + strB;
        String strSum2 = strB + strA;

        // string -> int
        sum1 = Integer.parseInt(strSum1);
        sum2 = Integer.parseInt(strSum2);

        // compare
        answer = Math.max(sum1, sum2);

        return answer;
    }
}
