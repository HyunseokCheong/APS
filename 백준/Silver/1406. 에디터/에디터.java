import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 위한 모듈
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 위한 모듈
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 문자열 입력
        String str = br.readLine();
        // n 입력
        int n = Integer.parseInt(br.readLine());
        // 커서를 기준으로 좌, 우 스택
        Stack<String> lStack = new Stack<String>();
        Stack<String> rStack = new Stack<String>();
        // 입력 받은 문자열을 좌측 스택에 전부 넣음
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            lStack.push(arr[i]);
        }
        // 명령을 입력 받고, 명령의 첫 번째 인자를 기준으로 실행
        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            char c = command.charAt(0);
            // 스위치
            switch (c) {
                case 'L':
                    if (!lStack.isEmpty()) {
                        rStack.push(lStack.pop());
                    }
                    break;
                case 'D':
                    if (!rStack.isEmpty()) {
                        lStack.push(rStack.pop());
                    }
                    break;
                case 'B':
                    if (!lStack.isEmpty()) {
                        lStack.pop();
                    }
                    break;
                case 'P':
                    char t = command.charAt(2);
                    lStack.push(String.valueOf(t));
                    break;
                default:
                    break;
            }
        }
        // 좌측 스택 -> 우측 스택
        while (!lStack.isEmpty())
            rStack.push(lStack.pop());
        // 우측 스택 -> 출력 공간
        while (!rStack.isEmpty())
            bw.write(rStack.pop());
        // 출력
        bw.flush();
        // 출력 종료
        bw.close();
    }
}
