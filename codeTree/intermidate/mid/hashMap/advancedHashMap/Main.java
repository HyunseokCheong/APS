package codeTree.intermidiateMid.hashMap.advancedHashMap;

import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("banana", 6);
        m.put("helloworld", 2);
        m.put("apple", 5);
        
        System.out.println(m.get("banana")); // key가 banana인 쌍의 value 출력 (6)
    }
}