package codeTree.intermidiateMid.hashMap.quiz05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             N, K;
    static HashMap<Long, Integer> hashMap;
    static long                   inputNumber, diff;
    static int answer;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        N  = Integer.parseInt(st.nextToken());
        K  = Integer.parseInt(st.nextToken());
        
        // solve
        hashMap = new HashMap<>();
        answer  = 0;
        st      = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            inputNumber = Integer.parseInt(st.nextToken());
            diff        = K - inputNumber;
            
            if (hashMap.containsKey(diff)) {
                answer += hashMap.get(diff);
            }
            
            if (!hashMap.containsKey(inputNumber)) {
                hashMap.put(inputNumber, 1);
            } else {
                hashMap.put(inputNumber, hashMap.get(inputNumber) + 1);
            }
        }
        
        // write
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}