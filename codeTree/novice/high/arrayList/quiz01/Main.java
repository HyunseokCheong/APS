package codeTree.noviceHigh.arrayList.quiz01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * summary
 * 1. push_back A: 정수 A를 동적 배열의 맨 뒤에 넣는 연산입니다.
 * 2. pop_back: 맨 뒤에 있는 정수를 하나 삭제합니다.
 * 3. size: 동적 배열에 들어있는 정수의 개수를 출력합니다.
 * 4. get k: k번째 숫자를 출력합니다.
 * input
 * N : 명령의 수(1 <= N <= 10,000)
 * num : 주어지는 정수(1 <= num <= 100,000)
 */

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N;
    static ArrayList<Integer> arrayList;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        
        // solve
        arrayList = new ArrayList<>();
        while (N-- >0) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push_back":
                    arrayList.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_back":
                    arrayList.remove(arrayList.size() - 1);
                    break;
                case "size":
                    bw.write(arrayList.size() + "\n");
                    break;
                case "get":
                    bw.write(arrayList.get(Integer.parseInt(st.nextToken()) - 1) + "\n");
                    break;
            }
        }
        
        // write
        bw.flush();
        bw.close();
    }
}
