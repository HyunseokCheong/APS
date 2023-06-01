import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0) {
                ans += num;
                stack.push(num);
            } else {
                ans -= stack.pop();
            }
        }
        System.out.println(ans);
    }
}