import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             lengthOfOriginPassword;
    static List<Integer>   originPassword;
    static int             numberOfQuery;
    static String          query;
    static int             X;
    static int             Y;
    
    static void insert(StringTokenizer st) {
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        for (int i = 0; i < Y; i++) {
            originPassword.add(X + i, Integer.parseInt(st.nextToken()));
        }
    }
    
    static void delete(StringTokenizer st) {
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        for (int i = 0; i < Y; i++) {
            originPassword.remove(X);
        }
    }
    
    static void add(StringTokenizer st) {
        Y = Integer.parseInt(st.nextToken());
        for (int i = 0; i < Y; i++) {
            originPassword.add(Integer.parseInt(st.nextToken()));
        }
    }
    
    public static void main(String[] args) throws IOException {
        for (int t = 1; t < 11; t++) {
            bw.write("#" + t + " ");
            
            lengthOfOriginPassword = Integer.parseInt(br.readLine());
            st                     = new StringTokenizer(br.readLine());
            originPassword         = new ArrayList<>();
            for (int i = 0; i < lengthOfOriginPassword; i++) {
                originPassword.add(Integer.parseInt(st.nextToken()));
            }
            numberOfQuery = Integer.parseInt(br.readLine());
            st            = new StringTokenizer(br.readLine());
            for (int i = 0; i < numberOfQuery; i++) {
                query = st.nextToken();
                switch (query) {
                    case "I":
                        insert(st);
                        break;
                    case "D":
                        delete(st);
                        break;
                    case "A":
                        add(st);
                        break;
                }
            }
            
            for (int i = 0; i < 10; i++) {
                bw.write(originPassword.get(i) + " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}