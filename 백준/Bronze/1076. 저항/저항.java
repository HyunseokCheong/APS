import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static long result;
    static Resist r1, r2, r3;
    static Map<String, Resist> resistMap;
    
    static class Resist {
        int value;
        int multi;
        
        public Resist(int value, int multi) {
            this.value = value;
            this.multi = multi;
        }
    }
    
    static void input() throws IOException {
        resistMap = new TreeMap<>();
        resistMap.put("black", new Resist(0, 1));
        resistMap.put("brown", new Resist(1, 10));
        resistMap.put("red", new Resist(2, 100));
        resistMap.put("orange", new Resist(3, 1000));
        resistMap.put("yellow", new Resist(4, 10000));
        resistMap.put("green", new Resist(5, 100000));
        resistMap.put("blue", new Resist(6, 1000000));
        resistMap.put("violet", new Resist(7, 10000000));
        resistMap.put("grey", new Resist(8, 100000000));
        resistMap.put("white", new Resist(9, 1000000000));
        r1 = resistMap.get(br.readLine());
        r2 = resistMap.get(br.readLine());
        r3 = resistMap.get(br.readLine());
    }
    
    static void process() throws IOException {
        result = (long) (r1.value * 10 + r2.value) * r3.multi;
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