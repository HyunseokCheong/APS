import java.io.*;
import java.util.*;

public class Main {
    // declare
    static int touchDown, fieldGoal, safety, onePointAfter, twoPointAfter, totalPoints;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // read
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            touchDown = Integer.parseInt(st.nextToken());
            fieldGoal = Integer.parseInt(st.nextToken());
            safety = Integer.parseInt(st.nextToken());
            onePointAfter = Integer.parseInt(st.nextToken());
            twoPointAfter = Integer.parseInt(st.nextToken());

            // solve
            totalPoints = touchDown * 6 + fieldGoal * 3 + safety * 2 + onePointAfter + twoPointAfter * 2;
            bw.write(totalPoints + " ");
        }

        // print
        bw.flush();
        bw.close();
    }
}