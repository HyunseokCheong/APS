import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader            br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter            bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer           st;
    static int                       numberOfPoint;
    static int                       index;
    static int[]                     pointArray;
    static int[]                     clonePointArray;
    static HashMap<Integer, Integer> hashMap;
    
    public static void main(String[] args) throws IOException {
        // read
        numberOfPoint = Integer.parseInt(br.readLine());
        pointArray    = new int[numberOfPoint];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numberOfPoint; i++) {
            pointArray[i] = Integer.parseInt(st.nextToken());
        }
        
        // solve
        clonePointArray = new int[numberOfPoint];
        clonePointArray = pointArray.clone();
        Arrays.sort(clonePointArray);
        
        hashMap = new HashMap<>();
        for (int i = 0; i < numberOfPoint; i++) {
            if (!hashMap.containsKey(clonePointArray[i])) {
                hashMap.put(clonePointArray[i], index++);
            }
        }
        
        // write
        for (int i = 0; i < numberOfPoint; i++) {
            bw.write(hashMap.get(pointArray[i]) + " ");
        }
        bw.flush();
        bw.close();
    }
}