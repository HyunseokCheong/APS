import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static final String[] memes = {
            "Never gonna give you up",
            "Never gonna let you down",
            "Never gonna run around and desert you",
            "Never gonna make you cry",
            "Never gonna say goodbye",
            "Never gonna tell a lie and hurt you",
            "Never gonna stop"
    };
    static int n;
    static String input;
    static boolean flag;
    static String answer;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            input = br.readLine();
            flag = false;
            for (String meme : memes) {
                if (input.equals(meme)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }

        answer = !flag ? "Yes" : "No";
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}