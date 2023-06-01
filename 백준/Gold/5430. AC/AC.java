import java.io.*;
import java.util.*;

public class Main {
    // declare
    static int testCase, n;
    static String command;
    static Deque<Integer> deque;
    static boolean reverse, isError;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // read
        testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            command = br.readLine();
            n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), "[],");
            deque = new ArrayDeque<>();
            reverse = false;
            isError = false;
            for (int i = 0; i < n; i++) deque.add(Integer.parseInt(st.nextToken()));

            for (int i = 0; i < command.length(); i++) {
                if (command.charAt(i) == 'R') {
                    reverse = !reverse;
                }
                else if (command.charAt(i) == 'D') {
                    if (deque.isEmpty()) {
                        bw.write("error" + "\n");
                        isError = true;
                        break;
                    }
                    if (reverse) deque.pollLast();
                    else deque.pollFirst();
                }
            }
            if (!isError) {
                bw.write("[");
                while (!deque.isEmpty()) {
                    if (reverse) bw.write(deque.pollLast() + "");
                    else bw.write(deque.pollFirst() + "");
                    if (!deque.isEmpty()) bw.write(",");
                }
                bw.write("]" + "\n");
            }
        }
        // print
        bw.flush();
        bw.close();
    }
}