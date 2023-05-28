import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int a, b;
        a = (n * 78) / 100;
        b = (n * 80) / 100 + ((n * 20) / 100) * 78 / 100;
        bw.write(a + " " + b + "\n");
        bw.flush();
        bw.close();
    }
}