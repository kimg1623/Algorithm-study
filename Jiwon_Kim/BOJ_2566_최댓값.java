package Jiwon_Kim;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * BOJ_2566_최댓값
 * Date: 20240226
 * Solving Time: 10min
 *
 * 배열에 저장하지 않고, 스캔하면서 최댓값 검증하는 방법으로 하는 편이 좋을 듯
 */
public class BOJ_2566_최댓값 {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] nums = new int[9][9];
    static int max=-1;
    static int maxR, maxC = 0;
    public static void main(String[] args) throws IOException {
        for(int i=0;i<9;i++)
            nums[i] = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if(nums[r][c] > max) {
                    max = nums[r][c];
                    maxR = r;
                    maxC = c;
                }
            }
        }
        System.out.println(max);
        System.out.println((maxR+1)+" "+(maxC+1));
    }
}


