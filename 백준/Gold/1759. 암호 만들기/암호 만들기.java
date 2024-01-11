import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    static int             lengthOfPassword;
    static int             numberOfCharacter;
    static char[]          characterList;
    static char[]          answer;
    static char[]          vowel;
    
    static void input() throws IOException {
        stk();
        lengthOfPassword  = Integer.parseInt(st.nextToken());
        numberOfCharacter = Integer.parseInt(st.nextToken());
        characterList     = new char[numberOfCharacter];
        stk();
        for (int i = 0; i < numberOfCharacter; i++) {
            characterList[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(characterList);
    }
    
    static void process() throws IOException {
        answer = new char[lengthOfPassword];
        vowel  = new char[]{'a', 'e', 'i', 'o', 'u'};
        
        recur(0, 0);
        
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
    
    static boolean check(char[] answer) {
        int mo = 0;
        int ja = 0;
        
        loop1:
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < vowel.length; j++) {
                if (answer[i] == vowel[j]) {
                    mo++;
                    continue loop1;
                }
            }
            ja++;
        }
        
        return mo >= 1 && ja >= 2;
    }
    
    static void recur(int depth, int index) throws IOException {
        if (depth == lengthOfPassword) {
            if (check(answer)) {
                for (int i = 0; i < lengthOfPassword; i++) {
                    bw.write(answer[i] + "");
                }
                bw.write(endl);
            }
            return;
        }
        for (int i = index; i < numberOfCharacter; i++) {
            answer[depth] = characterList[i];
            recur(depth + 1, i + 1);
        }
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}