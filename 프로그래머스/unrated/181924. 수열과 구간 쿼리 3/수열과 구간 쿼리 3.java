class Solution {
    /**
     * query: [i, j]
     * arr[i] <-> arr[j]
     *
     * @param arr     int[]
     * @param queries int[][]
     * @return arr int[]
     */
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
