package codeTree.noviceHigh.stack.basicStack;

import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();   // 정수를 관리할 stack을 선언합니다. => 빈 스택
        s.push(2);
        s.push(5);
        s.push(9);
        
        System.out.println(s.peek());       // 가장 나중에 들어온 원소를 출력합니다. => 9
        s.pop();                            // 가장 나중에 들어온 원소를 제거합니다.
        System.out.println(s.size());       // 원소의 개수를 출력합니다 => 2
        while (!s.isEmpty()) {                // 가장 나중에 들어간 원소부터 순서대로 출력합니다.
            System.out.println(s.pop());    // 순서대로 5 2 출력됩니다.
        }
    }
}