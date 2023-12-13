class Solution {
    public int solution(int[][] dots) {
        int minX = 256;
        int minY = 256;
        int maxX = -256;
        int maxY = -256;
        for (int[] dot : dots) {
            int x = dot[0];
            int y = dot[1];
            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }
        return (maxX - minX) * (maxY - minY);
    }
}