package atcoder.abc_314.b;

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static List<Person> people = new ArrayList<>();
    
    public static class Person {
        int id;
        int bet;
        List<Integer> toBet;
        
        public Person(int id, int bet, List<Integer> toBet) {
            this.id = id;
            this.bet = bet;
            this.toBet = toBet;
        }
    }
    
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        people = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int bet = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            List<Integer> toBet = new ArrayList<>();
            while (st.hasMoreTokens()) {
                toBet.add(Integer.parseInt(st.nextToken()));
            }
            Person person = new Person(i + 1, bet, toBet);
            people.add(person);
        }
        int X = Integer.parseInt(br.readLine());
        int count = 0;
        List<Integer> correctPerson = new ArrayList<>();
        int minBet = Integer.MAX_VALUE;
        for (Person p : people) {
            for (int i : p.toBet) {
                if (i == X) {
                    if (minBet > p.bet) {
                        minBet = p.bet;
                        count = 1;
                        correctPerson = new ArrayList<>();
                        correctPerson.add(p.id);
                    } else if (minBet == p.bet) {
                        count++;
                        correctPerson.add(p.id);
                    } else {
                        continue;
                    }
                }
            }
        }
        bw.write(count + "\n");
        if (count != 0) {
            for (int i : correctPerson) {
                bw.write(i + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
