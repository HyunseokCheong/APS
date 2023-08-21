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
    static int             numberOfCard;
    static int[]           cardList;
    static int             numberOfQuery;
    static int[]           queryList;
    
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
        Arrays.sort(cardList);
        for (int i = 0; i < numberOfQuery; i++) {
            bw.write(binarySearch(queryList[i], cardList, 0, numberOfCard - 1) + blank);
        }
    }
    
    static int binarySearch(int target, int[] cardList, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return 0;
        }
        
        int midIndex = (startIndex + endIndex) / 2;
        
        if (cardList[midIndex] == target) {
            return 1;
        } else if (cardList[midIndex] > target) {
            endIndex = midIndex - 1;
        } else if (cardList[midIndex] < target) {
            startIndex = midIndex + 1;
        }
        return binarySearch(target, cardList, startIndex, endIndex);
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