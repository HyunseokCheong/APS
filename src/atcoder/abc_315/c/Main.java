package atcoder.abc_315.c;

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N;
    static int[][] arr;
    static PriorityQueue<IceCream> queue = new PriorityQueue<>((o1, o2) -> o2.deliciousness - o1.deliciousness);
    static int maxDeli;
    static int curDeli;
    static int curFlavor;
    static int nextDeli;
    static int nextFlavor;
    
    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            queue.add(new IceCream(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
    }
    
    
    static void process() throws IOException {
        IceCream curIceCream = queue.poll();
        assert curIceCream != null;
        curDeli = curIceCream.deliciousness;
        curFlavor = curIceCream.flavor;
        maxDeli = 0;

        while (!queue.isEmpty()) {
            IceCream nextIceCream = queue.poll();
            nextDeli = nextIceCream.deliciousness;
            nextFlavor = nextIceCream.flavor;

            if (curFlavor == nextFlavor) {
                int largerDeli = Math.max(curDeli, nextDeli);
                int smallerDeli = Math.min(curDeli, nextDeli);
                maxDeli = Math.max(maxDeli, largerDeli + smallerDeli / 2);
            } else {
                maxDeli = Math.max(maxDeli, curDeli + nextDeli);
            }
        }
    }
    
    static void output() throws IOException {
        bw.write(maxDeli + "\n");
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
    
    static class IceCream {
        int flavor;
        int deliciousness;
        
        public IceCream(int flavor, int deliciousness) {
            this.flavor = flavor;
            this.deliciousness = deliciousness;
        }
    }
}
