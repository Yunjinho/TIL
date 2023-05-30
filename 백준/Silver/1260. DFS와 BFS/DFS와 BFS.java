
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] arr;
	static boolean[] dfsFlag;
	static boolean[] bfsFlag;
	static int node;
	static int line;
	static int startNode;
	static Queue<Integer> arr2;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st=new StringTokenizer(br.readLine());
		
		
		node=Integer.parseInt(st.nextToken());
		line=Integer.parseInt(st.nextToken());
		startNode=Integer.parseInt(st.nextToken());
		
		arr=new int[node+1][node+1];
		arr2=new LinkedList<Integer>();
		dfsFlag=new boolean[node+1];
		bfsFlag=new boolean[node+1];
		
		for(int i=0;i<line;i++) {
			st=new StringTokenizer(br.readLine());
			int num1=Integer.parseInt(st.nextToken());
			int num2=Integer.parseInt(st.nextToken());
			arr[num1][num2]=1;
			arr[num2][num1]=1;
		}
		dfs(startNode);
		System.out.println();
		bfs(startNode);
		
	}
	private static void bfs(int startNode) {
		bfsFlag[startNode]=true;
		System.out.print(startNode+" ");
		for (int i = 1; i <= node; i++) {
			if (arr[startNode][i] == 1 && !bfsFlag[i]) {
				bfsFlag[i]=true;
				arr2.add(i);
			}
		}
		if(arr2.size()!=0) {
			bfs(arr2.poll());
		}
	}

	private static void dfs(int startNode) {
		dfsFlag[startNode]=true;
		System.out.print(startNode+" ");
		for (int i = 1; i <= node; i++) {
			if (arr[startNode][i] == 1 && !dfsFlag[i])
				dfs(i);
		}
		
	}
}
