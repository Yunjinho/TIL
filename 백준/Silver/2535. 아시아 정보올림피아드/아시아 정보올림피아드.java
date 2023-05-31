
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[][] arr;
		int[] c = new int[100];
		int size = Integer.parseInt(br.readLine());
		arr = new int[size][3];
		for (int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[2] - o1[2];
			}
		});
		int m=1;
		for (int i = 0; i < size; i++) {
			if(c[arr[i][0]]<2) {
				System.out.println(arr[i][0]+" "+arr[i][1]);
				m++;
				c[arr[i][0]]++;
			}
			if(m==4) break;
		}
	}
}
