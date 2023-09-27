import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int testCase, n;
    static String Bi;
    
    public static void main(String[] args) throws IOException {
        testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            n = Integer.parseInt(br.readLine());
            Bi = Integer.toBinaryString(n);
            for (int i = Bi.length() - 1; i >= 0; i--) {
                if (Bi.charAt(i) == '1') {
                    bw.write(Bi.length() - i - 1 + " ");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}