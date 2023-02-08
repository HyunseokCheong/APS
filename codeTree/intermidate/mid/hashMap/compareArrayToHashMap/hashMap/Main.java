package codeTree.intermidiateMid.hashMap.compareArrayToHashMap.hashMap;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    
    public static final int MAX_N = 6;
    
    public static int[]                     arr        = new int[MAX_N];
    public static HashMap<Integer, Integer> numToIndex = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            numToIndex.put(arr[i], i + 1);
        }
        
        int k = sc.nextInt();
        System.out.println(numToIndex.get(k));
    }
}