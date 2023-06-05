
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int p;
	static int n;
	static int count=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Queue<Integer> people=new LinkedList<Integer>();
		st=new StringTokenizer(br.readLine());
		p=Integer.parseInt(st.nextToken());
		n=Integer.parseInt(st.nextToken());
		
		for(int i=1;i<p+1;i++) {
			people.add(i);
		}
		System.out.print("<");
		while(true) {
			count++;
			deletePeople(people);
			if(people.isEmpty()) {
				break;
			}
		}
		System.out.print(">");
	}
	public static void deletePeople(Queue<Integer> q) {
		int temp=q.poll();
		if(count==n) {
			System.out.print(temp);
			if(q.isEmpty()) {
				return;
			}
			System.out.print(", ");
			count=0;
			return;
		}
		q.add(temp);
	}
}
