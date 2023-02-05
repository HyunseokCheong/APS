package codeTree.intermidiateMid.hashMap.quiz04;

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
    static int N, M;
    static HashMap<String, Integer> stringIntegerHashMap;
    static HashMap<Integer, String> integerStringHashMap;
    static String inputString;
    static int inputInt;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        // solve
        stringIntegerHashMap = new HashMap<>();
        integerStringHashMap = new HashMap<>();
        for (int i = 1; i < N + 1; i++) {
            inputString = br.readLine();
            stringIntegerHashMap.put(inputString, i);
            integerStringHashMap.put(i, inputString);
        }
        
        for (int i = 0; i < M; i++) {
            inputString = br.readLine();
            
            if ('0' <= inputString.charAt(0) && inputString.charAt(0) <= '9') {
                inputInt = Integer.parseInt(inputString);
                bw.write(integerStringHashMap.get(inputInt) + "\n");
            } else {
                bw.write(stringIntegerHashMap.get(inputString) + "\n");
            }
        }
        
        // write
        bw.flush();
        bw.close();
    }
}