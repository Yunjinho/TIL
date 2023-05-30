
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * 나중에 들어온 것이 먼저 제거되는 LIFO 구조
 * 항상 끝에서만 삽입 삭제가 이루어짐
 * 
 */
public class Main {
	static Stack<Integer> stack=new Stack<Integer>();
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int num=Integer.parseInt(br.readLine());
		int start=0;
		while(num>0) {
			int value=Integer.parseInt(br.readLine());
			if(value>start) {
				for(int i=start+1;i<value+1;i++) {
					sb.append("+").append("\n");
					stack.add(i);
				}
				start=value;
			}else if(stack.peek()!=value) {
				System.out.println("NO");
				System.exit(0);
			}
			stack.pop();
			sb.append("-").append("\n");
			num--;
		}
		System.out.println(sb);
	}
}
