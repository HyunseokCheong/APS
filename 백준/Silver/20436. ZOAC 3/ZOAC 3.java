import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static Map<Character, int[]> charPos;
    static Set<Character> leftSet;
    static int[] left, right;
    static String line;
    
    static int getDist(int[] a, int[] b) {
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
    }
    
    static void input() throws IOException {
        leftSet = new TreeSet<>();
        leftSet.add('q');
        leftSet.add('w');
        leftSet.add('e');
        leftSet.add('r');
        leftSet.add('t');
        leftSet.add('a');
        leftSet.add('s');
        leftSet.add('d');
        leftSet.add('f');
        leftSet.add('g');
        leftSet.add('z');
        leftSet.add('x');
        leftSet.add('c');
        leftSet.add('v');
        
        charPos = new TreeMap<>();
        charPos.put('q', new int[]{0, 0});
        charPos.put('w', new int[]{0, 1});
        charPos.put('e', new int[]{0, 2});
        charPos.put('r', new int[]{0, 3});
        charPos.put('t', new int[]{0, 4});
        charPos.put('y', new int[]{0, 5});
        charPos.put('u', new int[]{0, 6});
        charPos.put('i', new int[]{0, 7});
        charPos.put('o', new int[]{0, 8});
        charPos.put('p', new int[]{0, 9});
        charPos.put('a', new int[]{1, 0});
        charPos.put('s', new int[]{1, 1});
        charPos.put('d', new int[]{1, 2});
        charPos.put('f', new int[]{1, 3});
        charPos.put('g', new int[]{1, 4});
        charPos.put('h', new int[]{1, 5});
        charPos.put('j', new int[]{1, 6});
        charPos.put('k', new int[]{1, 7});
        charPos.put('l', new int[]{1, 8});
        charPos.put('z', new int[]{2, 0});
        charPos.put('x', new int[]{2, 1});
        charPos.put('c', new int[]{2, 2});
        charPos.put('v', new int[]{2, 3});
        charPos.put('b', new int[]{2, 4});
        charPos.put('n', new int[]{2, 5});
        charPos.put('m', new int[]{2, 6});
        
        st = new StringTokenizer(br.readLine());
        left = charPos.get(st.nextToken().charAt(0));
        right = charPos.get(st.nextToken().charAt(0));
        line = br.readLine();
    }
    
    static void process() throws IOException {
        int result = 0;
        
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (leftSet.contains(c)) {
                result += getDist(left, charPos.get(c));
                left = charPos.get(c);
            } else {
                result += getDist(right, charPos.get(c));
                right = charPos.get(c);
            }
            result++;
        }
        
        bw.write(result + "\n");
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