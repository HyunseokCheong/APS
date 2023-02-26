import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    static double          weight;
    static double          height;
    static double          BMI;
    static String          answer;
    
    static void input() throws IOException {
        weight = Double.parseDouble(br.readLine());
        height = Double.parseDouble(br.readLine());
    }
    
    static void process() throws IOException {
        BMI = weight / (height * height);
        
        if (BMI > 25) {
            answer = "Overweight";
        } else if (BMI >= 18.5) {
            answer = "Normal weight";
        } else {
            answer = "Underweight";
        }
    }
    
    static void output() throws IOException {
        bw.write(answer + blank);
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}