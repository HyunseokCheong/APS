package codeTree.intermidiateMid.hashMap.compareArrayToHashMap.Array;

import java.util.Scanner;

public class Main {
    
    public static final int MAX_N = 6;
    public static final int MAX_R = 100;
    
    public static int[] arr        = new int[MAX_N];
    public static int[] numToIndex = new int[MAX_R + 1];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i]             = sc.nextInt();
            numToIndex[arr[i]] = i + 1;
        }
        
        int k = sc.nextInt();
        System.out.println(numToIndex[k]);
    }
}