import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    static int             testCase;
    static int             numberOfPoint;
    static int[]           pointList;
    static int             startIndex;
    static int             midIndex;
    static int             endIndex;
    static int             distance;
    static int             count;
    
    static void input() throws IOException {
        testCase = Integer.parseInt(br.readLine());
    }
    
    /**
     * 점 세개를 A, B, C라고 할 때
     * A, B를 정해 놓고 O(N^2)
     * 1. C를 B ~ N 사이에서 찾으면? O(N^3)
     * 2. C를 이분탐색으로 찾으면? O(N^2Log2N)
     *
     * @throws IOException
     */
    static void process() throws IOException {
        while (testCase-- > 0) {
            numberOfPoint = Integer.parseInt(br.readLine());
            pointList     = new int[numberOfPoint];
            st            = new StringTokenizer(br.readLine());
            for (int i = 0; i < numberOfPoint; i++) {
                pointList[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(pointList);
            
            count      = 0;
            startIndex = 0;
            endIndex   = numberOfPoint - 1;
            
            for (int i = 0; i < numberOfPoint - 1; i++) {
                for (int j = i + 1; j < numberOfPoint; j++) {
                    distance = pointList[j] - pointList[i];
                    if (binarySearch(startIndex, endIndex, pointList[j] + distance)) {
                        count++;
                    }
                }
            }
            
            bw.write(count + endl);
        }
        bw.flush();
        bw.close();
    }
    
    static boolean binarySearch(int startIndex, int endIndex, int distance) {
        while (startIndex <= endIndex) {
            midIndex = (startIndex + endIndex) / 2;
            
            if (pointList[midIndex] == distance) {
                return true;
            } else if (pointList[midIndex] > distance) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }
        }
        return false;
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}