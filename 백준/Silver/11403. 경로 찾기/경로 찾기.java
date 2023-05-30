
import java.io.*;
import java.util.*;

public class Main {
	static int[][] arr;
	static int[] visit;
	static int num;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		num = Integer.parseInt(br.readLine());
		arr = new int[num][num];
		visit = new int[num];
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < num; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int k = 0; k < num; k++) {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (arr[i][k] == 1 && arr[k][j] == 1) {
                        arr[i][j] = 1;
                    }
                }
            }
        }
		for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
            	System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
	}
}