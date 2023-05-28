import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             col;
    static int             row;
    static double          minDistance; // 최소 거리 갱신
    static double          curDistance; // 현재 거리
    static ArrayList<Node> nodeArrayList; // node 저장
    
    static class Node {
        
        int col;
        int row;
        
        Node(int col, int row) {
            this.col = col;
            this.row = row;
        }
    }
    
    static double getDistance(Node A, Node B) { // 두 node 사이 거리 반환
        return Math.sqrt(Math.pow(Math.abs(A.col - B.col), 2) + Math.pow(Math.abs(A.row - B.row), 2));
//        return Math.abs(A.col - B.col) + Math.abs(A.row - B.row);
    }
    
    public static void main(String[] args) throws IOException {
        // read
        st  = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        Node yumi = new Node(col, row); // 유미 위치 저장
        
        nodeArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            st  = new StringTokenizer(br.readLine());
            col = Integer.parseInt(st.nextToken());
            row = Integer.parseInt(st.nextToken());
            nodeArrayList.add(new Node(col, row)); // 각 사람의 위치 저장
        }
        
        minDistance = Double.MAX_VALUE;
        for (Node node1 : nodeArrayList) { // 사람 노드를 탐색하면서 같은 노드를 선택한 경우 continue
            for (Node node2 : nodeArrayList) {
                if (node1 == node2) {
                    continue;
                }
                for (Node node3 : nodeArrayList) {
                    if (node1 == node3 || node2 == node3) {
                        continue;
                    }
                    
                    // continue 되지 않는 경우의 총 이동거리를 최소 이동거리와 비교하면서 최소 이동거리를 갱신
                    curDistance = getDistance(yumi, node1) + getDistance(node1, node2) + getDistance(node2, node3);
                    minDistance = Math.min(minDistance, curDistance);
                }
            }
        }
        
        // 최소 이동거리 출력
        bw.write((int) minDistance + "");
        bw.flush();
        bw.close();
    }
}