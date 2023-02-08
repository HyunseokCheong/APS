package codeTree.intermidiateMid.hashMap.quiz02;

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
    static int inputNumber;
    static HashMap<Integer, Integer> hashMap;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        // solve
        hashMap = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            inputNumber = Integer.parseInt(st.nextToken());
            if (!hashMap.containsKey(inputNumber)) {
                hashMap.put(inputNumber, 1);
            } else {
                hashMap.put(inputNumber, hashMap.get(inputNumber) + 1);
            }
        }
        
        st = new StringTokenizer(br.readLine());
        while (M-- > 0) {
            inputNumber = Integer.parseInt(st.nextToken());
            bw.write(hashMap.getOrDefault(inputNumber, 0) + " ");
        }
        
        // write
        bw.flush();
        bw.close();
    }
}