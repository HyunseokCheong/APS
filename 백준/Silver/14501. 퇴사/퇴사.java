import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, maxCost;
    static int[] memo;
    static int[][] schedule;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        schedule = new int[n][2];
        memo = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            schedule[i][0] = Integer.parseInt(st.nextToken());
            schedule[i][1] = Integer.parseInt(st.nextToken());
            memo[i] = -1;
        }
    }
    
    static void backtracking(int day, int cost) {
        if (day == n) {
            maxCost = Math.max(maxCost, cost);
            return;
        }
        int nextDay = day + schedule[day][0];
        int nextCost = cost + schedule[day][1];
        if (nextDay <= n) {
            backtracking(nextDay, nextCost);
        }
        backtracking(day + 1, cost);
    }
    
    static int memoization(int day) {
        if (day >= n) {
            return 0;
        }
        if (memo[day] != -1) {
            return memo[day];
        }
        int nextDay = day + schedule[day][0];
        int takeCost = 0;
        if (nextDay <= n) {
            takeCost = schedule[day][1] + memoization(nextDay);
        }
        int skipCost = memoization(day + 1);
        memo[day] = Math.max(takeCost, skipCost);
        return memo[day];
    }
    
    static void process() throws IOException {
        maxCost = 0;
//        backtracking(0, 0);
//        bw.write(maxCost + "\n");
        bw.write(memoization(0) + "\n");
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
}