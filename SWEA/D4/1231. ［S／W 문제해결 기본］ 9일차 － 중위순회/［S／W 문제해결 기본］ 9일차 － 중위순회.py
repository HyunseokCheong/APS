import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Solution {
    
    // declare
    static BufferedReader  br       = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw       = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             testCase = 10;
    static int             numberOfNode;
    static char            characterOfNode;
    static char[]          tree;
    
    // L N R
    static void inOrder(int index) throws IOException {
        if (index > numberOfNode) {
            return;
        }
        inOrder(2 * index);
        bw.write(tree[index]);
        inOrder(2 * index + 1);
    }
    
    public static void main(String[] args) throws IOException {
        // read
        for (int t = 1; t <= testCase; t++) {
            numberOfNode = Integer.parseInt(br.readLine());
            tree         = new char[numberOfNode + 1];
            for (int i = 1; i <= numberOfNode; i++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                
                characterOfNode = st.nextToken().charAt(0);
                tree[i]         = characterOfNode;
            }
            bw.write("#" + t + " ");
            inOrder(1);
            bw.write("\n");
        }
        // solve
        // write
        bw.flush();
        bw.close();
    }
}