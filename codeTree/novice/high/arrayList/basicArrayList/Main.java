package codeTree.noviceHigh.arrayList.basicArrayList;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Integer> V = new ArrayList<>();
        V.add(5);
        System.out.println(V.size());
        System.out.println(V.get(0));
        
        V.add(2);
        V.add(9);
        System.out.println(V.get(1));
        System.out.println(V.get(2));
        System.out.println(V);
        
        V.remove(V.size() - 1);
        System.out.println(V.size());
        for (int i = 0; i < V.size(); i++) {
            System.out.println(V.get(i));
        }
    }
}
