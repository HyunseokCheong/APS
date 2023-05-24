import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             snowCount;
    static int[]           snowArr;
    
    public static class Snowman {
        
        int totalHeight;
        int firstHeight;
        int secondHeight;
    }
    
    public static Snowman[] snowmanArr;
    static        int       index;
    static        int       minDiffHeight;
    
    public static void main(String[] args) throws IOException {
        // read
        snowCount  = Integer.parseInt(br.readLine());
        st         = new StringTokenizer(br.readLine());
        snowArr    = new int[snowCount];
        snowmanArr = new Snowman[snowCount * (snowCount - 1) / 2];
        for (int i = 0; i < snowCount; i++) {
            snowArr[i] = Integer.parseInt(st.nextToken());
        }
        
        // solve
        index = 0;
        for (int i = 0; i < snowCount - 1; i++) {
            for (int j = i + 1; j < snowCount; j++) {
                snowmanArr[index]              = new Snowman();
                snowmanArr[index].firstHeight  = i;
                snowmanArr[index].secondHeight = j;
                snowmanArr[index].totalHeight  = snowArr[i] + snowArr[j];
                index++;
            }
        }
        
        minDiffHeight = Integer.MAX_VALUE;
        Arrays.sort(snowmanArr, (o1, o2) -> o1.totalHeight - o2.totalHeight);
        for (int i = 0; i < index - 1; i++) {
            for (int j = i + 1; j < index; j++) {
                if (snowmanArr[i].firstHeight != snowmanArr[j].firstHeight
                        && snowmanArr[i].firstHeight != snowmanArr[j].secondHeight
                        && snowmanArr[i].secondHeight != snowmanArr[j].firstHeight
                        && snowmanArr[i].secondHeight != snowmanArr[j].secondHeight) {
                    minDiffHeight = Math.min(minDiffHeight, snowmanArr[j].totalHeight - snowmanArr[i].totalHeight);
                    break;
                }
            }
        }
        
        // write
        bw.write(minDiffHeight + "");
        bw.flush();
        bw.close();
    }
}