import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader            br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter            bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer           st;
    static String                    endl  = "\n";
    static String                    blank = " ";
    static int                       numberOfCard;
    static int                       numberOfQuery;
    static int                       answer;
    static int[]                     cardList;
    static int[]                     queryList;
    static HashMap<Integer, Integer> hashMap;
    
    static void input() throws IOException {
        numberOfCard = Integer.parseInt(br.readLine());
        stk();
        cardList = new int[numberOfCard];
        for (int i = 0; i < numberOfCard; i++) {
            cardList[i] = Integer.parseInt(st.nextToken());
        }
        
        numberOfQuery = Integer.parseInt(br.readLine());
        stk();
        queryList = new int[numberOfQuery];
        for (int i = 0; i < numberOfQuery; i++) {
            queryList[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    static void process() throws IOException {
        hashMap = new HashMap<>();
        
        for (int i = 0; i < numberOfCard; i++) {
            if (hashMap.containsKey(cardList[i])) {
                hashMap.put(cardList[i], hashMap.get(cardList[i]) + 1);
            } else {
                hashMap.put(cardList[i], 1);
            }
        }
        
        for (int i = 0; i < numberOfQuery; i++) {
            
            answer = hashMap.getOrDefault(queryList[i], 0);
            
            bw.write(answer + blank);
        }
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}