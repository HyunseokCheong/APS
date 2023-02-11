import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    
    // declare
    static BufferedReader     br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter     bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer    st;
    static ArrayList<Integer> arrayList;
    static int                N, Q;
    static char command;
    static int  commandIndex, commandNumber, commandCount;
    
    public static void main(String[] args) throws IOException {
        for (int t = 1; t < 11; t++) {
            arrayList = new ArrayList<>();
            
            N  = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arrayList.add(Integer.parseInt(st.nextToken()));
            }
            
            Q  = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < Q; i++) {
                command = st.nextToken().charAt(0);
                
                switch (command) {
                    case 'I':
                        insert();
                        break;
                    case 'D':
                        delete();
                        break;
                    case 'A':
                        add();
                        break;
                }
            }
            bw.write("#" + t);
            for (int i = 0; i < 10; i++) {
                bw.write(" " + arrayList.get(i));
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
    
    static void insert() {
        commandIndex = Integer.parseInt(st.nextToken());
        commandCount = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < commandCount; i++) {
            commandNumber = Integer.parseInt(st.nextToken());
            arrayList.add(commandIndex, commandNumber);
            commandIndex++;
        }
    }
    
    static void delete() {
        commandIndex = Integer.parseInt(st.nextToken());
        commandCount = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < commandCount; i++) {
            arrayList.remove(commandIndex);
        }
    }
    
    static void add() {
        commandCount = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < commandCount; i++) {
            commandNumber = Integer.parseInt(st.nextToken());
            arrayList.add(commandNumber);
        }
    }
}