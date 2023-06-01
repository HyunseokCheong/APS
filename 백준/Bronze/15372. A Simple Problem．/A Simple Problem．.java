import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    // declare
    static BufferedReader 버퍼드리더  = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter 버퍼드라이터 = new BufferedWriter(new OutputStreamWriter(System.out));
    static int            테스트케이스;
    static long           입력받은정수;
    static long           정답;
    
    public static void main(String[] args) throws IOException {
        테스트케이스 = Integer.parseInt(버퍼드리더.readLine());
        
        for (int 케이스 = 0; 케이스 < 테스트케이스; 케이스++) {
            // read
            입력받은정수 = Integer.parseInt(버퍼드리더.readLine());
            
            // solve
            정답 = 입력받은정수 * 입력받은정수;
            
            // write
            버퍼드라이터.write(정답 + "\n");
        }
        
        버퍼드라이터.flush();
        버퍼드라이터.close();
    }
}