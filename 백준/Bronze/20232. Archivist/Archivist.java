import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader       br                = new BufferedReader(
            new InputStreamReader(System.in));
    static BufferedWriter       bw                = new BufferedWriter(
            new OutputStreamWriter(System.out));
    static StringTokenizer      st;
    static String               endl              = "\n";
    static String               blank             = " ";
    static Map<Integer, String> yearUniversityMap = new HashMap<>();
    static int                  year;
    
    
    static void input() throws IOException {
        year = Integer.parseInt(br.readLine());
    }
    
    
    static void process() throws IOException {
        yearUniversityMap.put(1995, "ITMO");
        yearUniversityMap.put(1996, "SPbSU");
        yearUniversityMap.put(1997, "SPbSU");
        yearUniversityMap.put(1998, "ITMO");
        yearUniversityMap.put(1999, "ITMO");
        yearUniversityMap.put(2000, "SPbSU");
        yearUniversityMap.put(2001, "ITMO");
        yearUniversityMap.put(2002, "ITMO");
        yearUniversityMap.put(2003, "ITMO");
        yearUniversityMap.put(2004, "ITMO");
        yearUniversityMap.put(2005, "ITMO");
        yearUniversityMap.put(2006, "PetrSU, ITMO");
        yearUniversityMap.put(2007, "SPbSU");
        yearUniversityMap.put(2008, "SPbSU");
        yearUniversityMap.put(2009, "ITMO");
        yearUniversityMap.put(2010, "ITMO");
        yearUniversityMap.put(2011, "ITMO");
        yearUniversityMap.put(2012, "ITMO");
        yearUniversityMap.put(2013, "SPbSU");
        yearUniversityMap.put(2014, "ITMO");
        yearUniversityMap.put(2015, "ITMO");
        yearUniversityMap.put(2016, "ITMO");
        yearUniversityMap.put(2017, "ITMO");
        yearUniversityMap.put(2018, "SPbSU");
        yearUniversityMap.put(2019, "ITMO");
        bw.write(yearUniversityMap.get(year) + endl);
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}