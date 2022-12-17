import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static double monster, user;
    static int answer;

    public static void main(String[] args) throws IOException {
        // read
        StringTokenizer st = new StringTokenizer(br.readLine());
        monster = Double.parseDouble(st.nextToken());
        user = Double.parseDouble(st.nextToken());

        // process
        monster = monster - ((monster * user) / 100);
        if (monster >= 100) answer = 0;
        else answer = 1;

        // write
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}