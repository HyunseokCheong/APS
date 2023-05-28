import java.io.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // declare
    static int sum, score;
    static int[] arr;
    
    public static void main(String[] args) throws IOException {
        // read
        arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        // solve
        sum = 0;
        score = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
            
            if (Math.abs(100 - score) >= Math.abs(100 - sum)) {
                score = sum;
                if (score >= 100) {
                    System.out.println(score);
                    return;
                }
            }
        }
        System.out.println(score);
    }
}