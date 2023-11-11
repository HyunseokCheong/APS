class Solution {
    public int solution(int num, int k) {
        // num -> string
        String[] arr = String.valueOf(num).split("");
        // string 탐색하다 k 찾으면 인덱스 반환
        String target = String.valueOf(k);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i + 1;
            }
        }
        // 탐색 끝났으면 -1 반환
        return -1;
    }
}