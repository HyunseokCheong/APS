/*
 * 난쟁이 9명 중 7명 뽑기
 *
 * 1 <= 키 <= 100
 * 2중 for문으로 제외할 난쟁이 뽑고 제외했을 때 키의 합이 100인지 확인
 */

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int totalHeight;
    static int[] dwarf;
    static int fakeDwarf1, fakeDwarf2;
    
    
    public static void main(String[] args) throws IOException {
        // read
        totalHeight = 0;
        dwarf = new int[9];
        for (int i = 0; i < 9; i++) {
            dwarf[i] = Integer.parseInt(br.readLine());
            totalHeight += dwarf[i];
        }
        
        // solve
        fakeDwarf1 = 0;
        fakeDwarf2 = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == j) {
                    continue;
                }
                if (totalHeight - dwarf[i] - dwarf[j] == 100) {
                    fakeDwarf1 = dwarf[i];
                    fakeDwarf2 = dwarf[j];
                    break;
                }
            }
            if (fakeDwarf1 != 0) {
                break;
            }
        }
        
        Arrays.sort(dwarf);
        for (int i = 0; i < 9; i++) {
            if (dwarf[i] != fakeDwarf1 && dwarf[i] != fakeDwarf2) {
                bw.write(dwarf[i] + "\n");
            }
        }
        
        // write
        bw.flush();
        bw.close();
    }
}