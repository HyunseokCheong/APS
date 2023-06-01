import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        Stack<String> lStack = new Stack<String>();
        Stack<String> rStack = new Stack<String>();

        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            lStack.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            char c = command.charAt(0);

            switch (c) {
                case 'L':
                    if (!lStack.isEmpty()) {
                        rStack.push(lStack.pop());
                    }
                    break;
                case 'D':
                    if (!rStack.isEmpty()) {
                        lStack.push(rStack.pop());
                    }
                    break;
                case 'B':
                    if (!lStack.isEmpty()) {
                        lStack.pop();
                    }
                    break;
                case 'P':
                    char t = command.charAt(2);
                    lStack.push(String.valueOf(t));
                    break;
                default:
                    break;
            }
        }
        while (!lStack.isEmpty())
            rStack.push(lStack.pop());
        while (!rStack.isEmpty())
            bw.write(rStack.pop());
        bw.flush();
        bw.close();
    }
}
