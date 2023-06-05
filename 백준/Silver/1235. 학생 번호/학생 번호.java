
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static String[] student;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		student=new String[size];
		for(int i=0;i<size;i++) {
			student[i]=br.readLine();
		}
		int num=1;
		while(num<student[0].length()) {
			if(sol(num)) {
				break;
			}
			num++;
		}
		System.out.println(num);
	}
	public static boolean sol(int num) {
		List<String> list=new ArrayList<String>();
		for(int i=0;i<student.length;i++) {
			String str=student[i].substring(student[i].length()-num,student[i].length());
			if(list.contains(str)) {
				return false;
			}
			list.add(str);
		}
		return true;
	}
}
