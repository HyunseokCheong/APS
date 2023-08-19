import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static int result;
    static int[][] arr;
    static int[] min;
    static int[] isSelected;
    static ArrayList<String> stringArrayList;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1][5];
        min = new int[4];
        stringArrayList = new ArrayList<>();
        stk();
        for (int i = 0; i < 4; i++) {
            min[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= n; i++) {
            stk();
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
    
    static void solve() throws IOException {
        result = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            isSelected = new int[n];
            dfs(0, i, 1);
        }
        if (result == Integer.MAX_VALUE) {
            bw.write(-1 + "\n");
            return;
        }
        Collections.sort(stringArrayList);
        bw.write(result + "\n");
        bw.write(stringArrayList.get(0) + "\n");
    }
    
    static void dfs(int count, int x, int start) {
        if (count == x) {
            isCheck(x);
            return;
        }
        for (int i = start; i <= n; i++) {
            isSelected[count] = i;
            dfs(count + 1, x, i + 1);
        }
    }
    
    static void isCheck(int x) {
        int[] sum = new int[4];
        int price = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < 4; j++) {
                sum[j] += arr[isSelected[i]][j];
            }
            price += arr[isSelected[i]][4];
        }
        
        boolean isEnough = true;
        for (int i = 0; i < 4; i++) {
            if (min[i] > sum[i]) {
                isEnough = false;
                break;
            }
        }
        
        if (isEnough) {
            if (result > price) {
                result = price;
                stringArrayList.clear();
            }
            if (result == price) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < x; i++) {
                    sb.append(isSelected[i] + " ");
                }
                stringArrayList.add(sb.toString());
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        input();
        solve();
        bw.flush();
        bw.close();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}