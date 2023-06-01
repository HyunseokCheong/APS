import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            switch (input[0]) {
                case "push": stack.push(Integer.parseInt(input[1])); break;
                case "pop":
                    if (stack.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(stack.pop() + "\n");
                    break;
                case "size": bw.write(stack.size() + "\n"); break;
                case "empty":
                    if (stack.isEmpty()) bw.write(1 + "\n");
                    else bw.write(0 + "\n");
                    break;
                case "top":
                    if (stack.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(stack.peek() + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}