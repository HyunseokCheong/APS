import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            char[] data = br.readLine().replaceAll(" ", "").toCharArray();
            
            Map<Character, Integer> charCount = new HashMap<>();
            for (char c : data) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
            
            int maxFreq = 0;
            char maxChar = ' ';
            for (Character c : charCount.keySet()) {
                int freq = charCount.get(c);
                if (freq > maxFreq) {
                    maxFreq = freq;
                    maxChar = c;
                } else if (freq == maxFreq) {
                    maxChar = '?';
                }
            }
            bw.write(maxChar + "\n");
        }
        bw.flush();
        bw.close();
    }
}