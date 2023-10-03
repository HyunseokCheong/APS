import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static String[] arr;
    static char answer;
    static int answerLength;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
    }
    
    static void process() throws IOException {
        answer = ' ';
        answerLength = 0;
        loop1:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (check(arr[i], arr[j])) {
                    answer = arr[i].charAt(arr[i].length() / 2);
                    answerLength = arr[i].length();
                    break loop1;
                }
            }
        }
        bw.write(answerLength + " " + answer + "\n");
    }
    
    static boolean check(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(b.length() - i - 1)) {
                return false;
            }
        }
        
        return true;
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