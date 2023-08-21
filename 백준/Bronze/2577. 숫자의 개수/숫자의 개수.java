import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int num = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        br.close();

        while (num != 0) {
            arr[num % 10]++;
            num /= 10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}