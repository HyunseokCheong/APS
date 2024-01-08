import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> lStack = new Stack<Character>();
        Stack<Character> rStack = new Stack<Character>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '<') {
                    if (!lStack.isEmpty()) {
                        rStack.push(lStack.pop());
                    }
                } else if (str.charAt(j) == '>') {
                    if (!rStack.isEmpty()) {
                        lStack.push(rStack.pop());
                    }
                } else if (str.charAt(j) == '-') {
                    if (!lStack.isEmpty()) {
                        lStack.pop();
                    }
                } else {
                    lStack.push(str.charAt(j));
                }
            }
            while (!rStack.isEmpty()) lStack.push(rStack.pop());
            while (!lStack.isEmpty()) sb.append(lStack.pop());
            sb.reverse();
            bw.write(sb + "\n");
        }
        bw.flush();
        bw.close();
    }
}