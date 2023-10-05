import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m, k;
    static List<Grade> grades;
    static Set<String> open;
    static int maxPoint, minPoint;
    static PriorityQueue<Grade> maxGradePQ, minGradePQ;
    
    static class Grade {
        String name;
        int point;
        
        public Grade(String name, int point) {
            this.name = name;
            this.point = point;
        }
    }
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        grades = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            grades.add(new Grade(st.nextToken(), Integer.parseInt(st.nextToken())));
        }
        open = new TreeSet<>();
        for (int i = 0; i < k; i++) {
            open.add(br.readLine());
        }
    }
    
    static void process() throws IOException {
        maxGradePQ = new PriorityQueue<>((g1, g2) -> g2.point - g1.point);
        minGradePQ = new PriorityQueue<>((g1, g2) -> g1.point - g2.point);
        minPoint = 0;
        maxPoint = 0;
        for (Grade grade : grades) {
            if (open.contains(grade.name)) {
                minPoint += grade.point;
                maxPoint += grade.point;
            }
            maxGradePQ.add(grade);
            minGradePQ.add(grade);
        }
        int count = m - k;
        while (!maxGradePQ.isEmpty() && count != 0) {
            Grade grade = maxGradePQ.poll();
            if (open.contains(grade.name)) {
                continue;
            }
            maxPoint += grade.point;
            count--;
        }
        count = m - k;
        while (!minGradePQ.isEmpty() && count != 0) {
            Grade grade = minGradePQ.poll();
            if (open.contains(grade.name)) {
                continue;
            }
            minPoint += grade.point;
            count--;
        }
    }
    
    static void output() throws IOException {
        bw.write(minPoint + " " + maxPoint + "\n");
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}