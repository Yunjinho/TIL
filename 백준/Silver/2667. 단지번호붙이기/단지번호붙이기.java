
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int[][] map;
	static boolean[][] visit;
	static int size;
	static int count = 0;
	static List<Integer> result;
	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { -1, 1, 0, 0 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		size = Integer.parseInt(br.readLine());

		map = new int[size][size];
		visit = new boolean[size][size];

		result = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			String str = br.readLine();
			for (int j = 0; j < size; j++) {
				map[i][j] = str.charAt(j)-'0';
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if(map[i][j]==1&&!visit[i][j]) {
					count=1;
					dfs(i,j);
					result.add(count);
				}
			}
		}
		Collections.sort(result);
		System.out.println(result.size());
		for(int list:result) {
			System.out.println(list);
		}
	}

	private static void dfs(int x, int y) {
		visit[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && ny >= 0 && nx < size && ny < size) {
				if(map[nx][ny]==1&&!visit[nx][ny]) {
					dfs(nx,ny);
					count++;
				}
			}
		}

	}
}
