/*
 * TroyMartian 최소 3개의 안테나, 최대 4개의 눈
 * VladSaturnian 최대 6개의 안테나, 최소 2개의 눈
 * GraemeMercurian 최대 2개의 안테나, 최대 3개의 눈
 *
 * 안테나, 눈
 */

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int antenna, eye;
    
    public static void main(String[] args) throws IOException {
        // read
        antenna = Integer.parseInt(br.readLine());
        eye = Integer.parseInt(br.readLine());
        
        // solve
        if (antenna >= 3 && eye <= 4) {
            bw.write("TroyMartian" + "\n");
        }
        if (antenna <= 6 && eye >= 2) {
            bw.write("VladSaturnian" + "\n");
        }
        if (antenna <= 2 && eye <= 3) {
            bw.write("GraemeMercurian" + "\n");
        }
        
        // write
        bw.flush();
        bw.close();
    }
}