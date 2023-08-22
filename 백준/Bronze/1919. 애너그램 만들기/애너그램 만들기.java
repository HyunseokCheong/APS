import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        char[] char1 = br.readLine().toCharArray();
        char[] char2 = br.readLine().toCharArray();

        for (int i = 0; i < char1.length; i++) {
            arr[char1[i] - 'a']++;
        }
        for (int i = 0; i < char2.length; i++) {
            arr[char2[i] - 'a']--;
        }

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) ans += Math.abs(arr[i]);
        }
        System.out.println(ans);
    }
}