import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] arr = {6, 66, 792, 10296, 144144, 2162160, 34594560, 588107520};
    
    public static void main(String[] args) throws IOException {
        System.out.println(arr[Integer.parseInt(br.readLine()) - 10]);
    }
}