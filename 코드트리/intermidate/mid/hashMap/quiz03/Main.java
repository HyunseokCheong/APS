package codeTree.intermidiateMid.hashMap.quiz03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N;
    static String inputString;
    static HashMap<String, Integer> hashMap;
    static int maxVal;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        
        // solve
        hashMap = new HashMap<>();
        while (N-->0) {
            inputString = br.readLine();
            if (!hashMap.containsKey(inputString)) {
                hashMap.put(inputString, 1);
            } else {
                hashMap.put(inputString, hashMap.get(inputString) + 1);
            }
            maxVal = Math.max(maxVal, hashMap.get(inputString));
        }
        
        // write
        bw.write(maxVal + "");
        bw.flush();
        bw.close();
    }
}