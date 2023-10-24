import java.io.*;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static String input;
    static double[] arr;
    
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        input = br.readLine();
        arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }
    }
    
    static void process() throws IOException {
        Stack<Double> stack = new Stack<>();
        double result = 0;
        char c;
        double first, second;
        
        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                stack.push(arr[c - 'A']);
                continue;
            }
            if (!stack.isEmpty()) {
                first = stack.pop();
                second = stack.pop();
                switch (c) {
                    case '+':
                        result = second + first;
                        break;
                    case '-':
                        result = second - first;
                        break;
                    case '*':
                        result = second * first;
                        break;
                    case '/':
                        result = second / first;
                        break;
                }
                stack.push(result);
            }
        }
        bw.write(String.format("%.2f", result) + "\n");
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}