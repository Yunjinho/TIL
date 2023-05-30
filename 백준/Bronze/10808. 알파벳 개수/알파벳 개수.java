
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		for(int i=0;i<26;i++) {
			int count=0;
			int c=i+97;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)==c) {
					count++;
				}
			}
			System.out.print(count + " ");
		}
	}
}
