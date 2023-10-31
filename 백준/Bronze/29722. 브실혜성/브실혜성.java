import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String[] line;
    static int n;
    static int year, month, day;
    
    static void input() throws IOException {
        line = br.readLine().split("-");
        year = Integer.parseInt(line[0]);
        month = Integer.parseInt(line[1]);
        day = Integer.parseInt(line[2]);
        n = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        day += n;
        while (day > 30) {
            month++;
            day -= 30;
        }
        while (month > 12) {
            year++;
            month -= 12;
        }
        // 2023-8-8 -> 2023-08-08
        bw.write(String.format("%04d-%02d-%02d", year, month, day));
        bw.newLine();
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