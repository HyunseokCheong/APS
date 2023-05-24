import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             numberOfNode;
    static char            characterOfNode;
    static char[]          tree;
    
    static void inOrder(int index) throws IOException {
        if (index > numberOfNode) {
            return;
        }
        
        inOrder(index * 2);
        bw.write(tree[index]);
        inOrder(index * 2 + 1);
    }
    
    public static void main(String[] args) throws IOException {
        // read
        for (int testCase = 1; testCase < 11; testCase++) {
            numberOfNode = Integer.parseInt(br.readLine());
            tree         = new char[numberOfNode + 1];
            for (int i = 1; i <= numberOfNode; i++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                characterOfNode = st.nextToken().charAt(0);
                tree[i]         = characterOfNode;
            }
            
            bw.write("#" + testCase + " ");
            inOrder(1);
            bw.write("\n");
        }
        // solve
        // write
        bw.flush();
        bw.close();
    }
}