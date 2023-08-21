package strick;

import java.io.*;

public class BOJ_28691 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String input;
    
    static void input() throws IOException {
        input = br.readLine();
    }
    
    static void process() throws IOException {
        String answer = "";
        switch (input) {
            case "M":
                answer = "MatKor";
                break;
            case "W":
                answer = "WiCys";
                break;
            case "C":
                answer = "CyKor";
                break;
            case "A":
                answer = "AlKor";
                break;
            case "$":
                answer = "$clear";
                break;
        }
        bw.write(answer + "\n");
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
