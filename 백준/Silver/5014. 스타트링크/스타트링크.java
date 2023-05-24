import java.io.*;
import java.util.*;

public class Main {
    // read
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int totalFloor, targetFloor, startFloor, up, down;
    static int[] building;

    // process
    static int nextFloor, currentFloor, currentCount;
    static int[] dist, upOrDown, currentState;
    static Queue<int[]> queue;

    // write

    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        totalFloor = Integer.parseInt(st.nextToken());
        startFloor = Integer.parseInt(st.nextToken());
        targetFloor = Integer.parseInt(st.nextToken());
        up = Integer.parseInt(st.nextToken());
        down = Integer.parseInt(st.nextToken());

        building = new int[totalFloor + 1];
        dist = new int[totalFloor + 1];
        upOrDown = new int[]{up, -down};
        queue = new LinkedList<>();

        // process
        queue.add(new int[]{startFloor, 0});
        dist[startFloor] = 1;

        while (!queue.isEmpty()) {
            currentState = queue.poll();
            currentFloor = currentState[0];
            currentCount = currentState[1];

            if (currentFloor == targetFloor) {
                bw.write(currentCount + "\n");
                bw.flush();
                bw.close();
                return;
            }

            for (int i = 0; i < 2; i++) {
                nextFloor = currentFloor + upOrDown[i];

                if (nextFloor >= 1 && nextFloor <= totalFloor && dist[nextFloor] == 0) {
                    queue.add(new int[]{nextFloor, currentCount + 1});
                    dist[nextFloor] = currentCount + 1;
                }
            }
        }

        // write
        bw.write("use the stairs" + "\n");
        bw.flush();
        bw.close();
    }
}