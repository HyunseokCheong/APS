package codeTree.intermidiateMid.hashMap.quiz01;

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
    static int tempKey;
    static HashMap<Integer, Integer> hashMap;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        
        // solve
        hashMap = new HashMap<>();
        while (N-- >0) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "add":
                    hashMap.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
                    break;
                case "remove":
                    hashMap.remove(Integer.parseInt(st.nextToken()));
                    break;
                case "find":
                    tempKey = Integer.parseInt(st.nextToken());
                    if (!hashMap.containsKey(tempKey)) {
                        bw.write("None" + "\n");
                    } else {
                        bw.write(hashMap.get(tempKey) + "\n");
                    }
                    break;
            }
        }
        
        // write
        bw.flush();
        bw.close();
    }
}