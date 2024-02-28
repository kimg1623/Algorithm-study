package Jiwon_Kim;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BOJ_2559_수열
 * Date: 20240223
 * Solving Time: 5min
 */
public class BOJ_2559_수열 {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String word;
    public static void main(String[] args) throws IOException {
        word = br.readLine();
        StringBuffer sb = new StringBuffer(word);
        for(int i = 0; i<sb.length()/2;i++) {
            if (sb.charAt(i) != sb.charAt(sb.length()-1-i)) {
                System.out.println("0");
                return;
            }


        }
        System.out.println("1");
    }
}


