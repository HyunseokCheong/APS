import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    static String          emoji;
    static int             point;
    
    static void input() throws IOException {
        emoji = br.readLine();
    }
    
    /**
     * 이모지 전체 길이
     * + 콜론의 개수
     * + 언더바의 개수 * 5
     *
     * @throws IOException
     */
    static void process() throws IOException {
        point = 0;
        for (char c : emoji.toCharArray()) {
            if (c == ':') {
                point += 2;
                continue;
            }
            if (c == '_') {
                point += 6;
                continue;
            }
            point++;
        }
        
        bw.write(point + endl);
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}