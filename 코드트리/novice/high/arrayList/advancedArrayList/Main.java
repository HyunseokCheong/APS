package codeTree.noviceHigh.arrayList.advancedArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Java Collection(Container) : Stack, Queue, Deque, ArrayList...
 * Container는 Iterator로 순회 가능
 */
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Integer> V       = new ArrayList<>(); // 정수를 관리할 ArrayList 선언
        V.add(5); // V : 5
        V.add(2); // V : 5  2
        V.add(9); // V : 5  2   9
        
        Iterator<Integer> iterator = V.iterator(); // Iterator를 이용한 Vector 컨테이너 내의 원소들 순회
        while (iterator.hasNext()) {
            Integer num            = iterator.next();
            System.out.println(num); // 5   2   9
        }
    }
}
