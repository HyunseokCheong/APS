package codeTree.noviceHigh.deque.basicDeque;

import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>(); // 정수를 관리할 deque를 선언합니다. => 빈 덱
        
        dq.addFirst(3);                         // 맨 앞에 3을 추가합니다.
        dq.addFirst(5);                         // 맨 앞에 5를 추가합니다.
        System.out.println(dq.peekFirst());     // 맨 앞에 적혀있는 숫자인 5가 출력됩니다.
        System.out.println(dq.peekLast());      // 맨 뒤에 적혀있는 숫자인 3이 출력됩니다.
        dq.addLast(9);                          // 맨 뒤에 9를 추가합니다.
        System.out.println(dq.peekLast());      // 맨 뒤에 적혀있는 숫자인 9가 출력됩니다.
        dq.pollFirst();                         // 맨 앞 숫자(5)를 제거합니다.
        System.out.println(dq.peekFirst());     // 맨 앞에 적혀있는 숫자인 3이 출력됩니다.
        System.out.println(dq.size());          // 원소의 개수를 출력합니다 => 2
    }
}
