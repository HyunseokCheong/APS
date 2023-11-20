import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String k = st.nextToken();
        int result = 0;
        for (int h = 0; h < n + 1; h++) {
            for (int m = 0; m < 60; m++) {
                loop1:
                for (int s = 0; s < 60; s++) {
                    String s1 = String.valueOf(h);
                    String s2 = String.valueOf(m);
                    String s3 = String.valueOf(s);
                    for (int i = 0; i < s1.length(); i++) {
                        if (k.equals(String.valueOf(s1.charAt(i))) || (s1.length() == 1 && k.equals("0"))) {
                            result++;
                            continue loop1;
                        }
                    }
                    for (int i = 0; i < s2.length(); i++) {
                        if (k.equals(String.valueOf(s2.charAt(i))) || (s2.length() == 1 && k.equals("0"))) {
                            result++;
                            continue loop1;
                        }
                    }
                    for (int i = 0; i < s3.length(); i++) {
                        if (k.equals(String.valueOf(s3.charAt(i))) || (s3.length() == 1 && k.equals("0"))) {
                            result++;
                            continue loop1;
                        }
                    }
                }
            }
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}