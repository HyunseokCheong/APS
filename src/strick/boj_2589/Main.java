package strick.boj_2589;

import java.io.*;
import java.util.*;

public class Main {
    
    // 좌표와 거리를 저장하는 Point 클래스
    static class Point {
        int r, c, d;
        
        public Point(int r, int c, int d) {
            this.r = r;
            this.c = c;
            this.d = d;
        }
    }
    
    // 보드의 상태와 로직을 처리하는 Board 클래스
    static class Board {
        private char[][] layout;  // 보드의 레이아웃
        private int[][] distance; // 각 지점까지의 거리
        private boolean[][] visited; // 방문 여부
        private int maxDistance = 0; // 최대 거리
        
        // 상하좌우 움직임을 위한 배열
        private final int[] dr = {-1, 1, 0, 0};
        private final int[] dc = {0, 0, -1, 1};
        
        // 생성자
        public Board(char[][] layout) {
            this.layout = layout;
        }
        
        // 최대 거리를 계산하는 메서드
        public int computeMaxDistance() {
            // 모든 칸을 순회하며 'L'이면 BFS 실행
            for (int i = 0; i < layout.length; i++) {
                for (int j = 0; j < layout[0].length; j++) {
                    if (layout[i][j] == 'L') {
                        distance = new int[layout.length][layout[0].length];
                        visited = new boolean[layout.length][layout[0].length];
                        bfs(i, j);
                    }
                }
            }
            return maxDistance;
        }
        
        // BFS를 실행하는 메서드
        private void bfs(int r, int c) {
            Queue<Point> queue = new LinkedList<>();
            queue.add(new Point(r, c, 0));
            visited[r][c] = true;
            
            // 큐가 빌 때까지 BFS 실행
            while (!queue.isEmpty()) {
                Point p = queue.poll();
                for (int i = 0; i < 4; i++) {
                    int nextR = p.r + dr[i];
                    int nextC = p.c + dc[i];
                    int nextDist = p.d + 1;
                    
                    // 유효한 다음 칸이면 큐에 넣고 거리 업데이트
                    if (isValid(nextR, nextC, nextDist)) {
                        queue.add(new Point(nextR, nextC, nextDist));
                        visited[nextR][nextC] = true;
                        distance[nextR][nextC] = nextDist;
                        maxDistance = Math.max(maxDistance, nextDist);
                    }
                }
            }
        }
        
        // 유효한 칸인지 체크하는 메서드
        private boolean isValid(int r, int c, int nextDist) {
            return r >= 0 && r < layout.length && c >= 0 && c < layout[0].length &&
                    layout[r][c] == 'L' && !visited[r][c] && distance[r][c] < nextDist;
        }
    }
    
    // 메인 메서드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 입력 처리
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        char[][] boardLayout = new char[R][C];
        for (int i = 0; i < R; i++) {
            boardLayout[i] = br.readLine().toCharArray();
        }
        
        // Board 객체 생성 후 최대 거리 계산
        Board board = new Board(boardLayout);
        int result = board.computeMaxDistance();
        
        // 결과 출력
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
