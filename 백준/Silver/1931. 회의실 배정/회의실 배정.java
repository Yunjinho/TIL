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
		int size =Integer.parseInt(br.readLine());
		int count =1;
		int[][] time=new int[size][2];
		for(int i=0;i<size;i++) {
			st=new StringTokenizer(br.readLine());
			time[i][0]=Integer.parseInt(st.nextToken());// start
			time[i][1]=Integer.parseInt(st.nextToken());// end
		}
		Arrays.sort(time,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1,int[]o2) {
                if(o1[1]==o2[1]){
                    return o1[0]-o2[0];
                }
				return o1[1]-o2[1];
			}
		});
		int start=time[0][0];
		int end=time[0][1];
		for(int i=1;i<size;i++) {
			if(time[i][0]>=end) {
				count++;
				start=time[i][0];
				end=time[i][1];
			}
		}
		System.out.println(count);
	}
 
}
