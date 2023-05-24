import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader   br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter   bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer  st;
    static int              numberOfPoint;
    static int              row;
    static int              col;
    static ArrayList<Point> pointArrayList;
    static int              minDist;
    static int              curDist;
    static int              totalDist;
    static int              maxDist;
    
    static class Point {
        
        int row;
        int col;
        
        Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    
    static int getDist(Point prePoint, Point curPoint) {
        return Math.abs(prePoint.row - curPoint.row) + Math.abs(prePoint.col - curPoint.col);
    }
    
    public static void main(String[] args) throws IOException {
        // read
        numberOfPoint  = Integer.parseInt(br.readLine());
        pointArrayList = new ArrayList<>();
        for (int i = 0; i < numberOfPoint; i++) {
            st  = new StringTokenizer(br.readLine());
            row = Integer.parseInt(st.nextToken());
            col = Integer.parseInt(st.nextToken());
            pointArrayList.add(new Point(row, col));
        }
        
        // solve
        totalDist = 0;
        Point prePoint = pointArrayList.get(0);
        Point curPoint;
        for (int i = 0; i < numberOfPoint; i++) {
            curPoint = pointArrayList.get(i);
            totalDist += getDist(prePoint, curPoint);
            prePoint = curPoint;
        }
        
        maxDist = Integer.MIN_VALUE;
        Point nextPoint;
        for (int i = 1; i < numberOfPoint - 1; i++) {
            prePoint  = pointArrayList.get(i - 1);
            curPoint  = pointArrayList.get(i);
            nextPoint = pointArrayList.get(i + 1);
            curDist   = getDist(prePoint, nextPoint);
            int tempDist = getDist(prePoint, curPoint) + getDist(curPoint, nextPoint);
            maxDist = Math.max(maxDist, tempDist - curDist);
        }
        
        minDist = totalDist - maxDist;
        
        // write
        bw.write(minDist + "");
        bw.flush();
        bw.close();
    }
}