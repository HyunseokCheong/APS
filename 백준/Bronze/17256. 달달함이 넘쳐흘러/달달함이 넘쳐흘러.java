import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int ax, ay, az, bx, by, bz, cx, cy, cz;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ax = Integer.parseInt(st.nextToken());
        ay = Integer.parseInt(st.nextToken());
        az = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        cx = Integer.parseInt(st.nextToken());
        cy = Integer.parseInt(st.nextToken());
        cz = Integer.parseInt(st.nextToken());

        bw.write((cx - az) + " " + (cy / ay) + " " + (cz - ax) + "\n");
        bw.flush(); bw.close();
    }
}