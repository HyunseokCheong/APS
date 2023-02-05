package codeTree.noviceHigh.queue.basicQueue;

import java.util.Queue;
import java.util.LinkedList;

public class Main {
    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // 정수를 관리할 queue를 선언합니다. => 빈 큐
        q.add(3);
        q.add(5);
        q.add(9);
        
        System.out.println(q.peek());     // 가장 앞에 있는 원소를 출력합니다. => 3
        q.poll();                         // 가장 앞에 있는 원소를 제거합니다.
        System.out.println(q.size());     // 원소의 개수를 출력합니다 => 2
        while (!q.isEmpty()) {              // 가장 앞에 있는 원소부터 순서대로 출력합니다.
            System.out.println(q.poll()); // 순서대로 5 9가 출력됩니다.
        }
    }
}