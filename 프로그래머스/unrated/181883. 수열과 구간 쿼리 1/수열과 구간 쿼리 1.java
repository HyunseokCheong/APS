class Solution {
    /**
     * query: [s, e]
     * arr[s] ~ arr[e] += 1
     *
     * @param arr     int[]
     * @param queries int[][]
     * @return arr int[]
     */
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            for (int i = s; i <= e; i++) {
                arr[i] += 1;
            }
        }
        return arr;
    }
}
