import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, maxCount;
    static String book;
    static Map<String, Integer> bookCount;
    static List<String> books;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        bookCount = new TreeMap<>();
        books = new ArrayList<>();
    }
    
    static void process() throws IOException {
        maxCount = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            book = br.readLine();
            bookCount.put(book, bookCount.getOrDefault(book, 0) + 1);
            maxCount = Math.max(maxCount, bookCount.get(book));
            if (!books.contains(book)) {
                books.add(book);
            }
        }
        Collections.sort(books);
        for (String book : books) {
            if (maxCount == bookCount.get(book)) {
                bw.write(book + "\n");
                break;
            }
        }
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