
import java.util.Scanner;

public class Main {
	public static int result = Integer.MIN_VALUE;
	public static int prodCnt;
	public static int maxWeight;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		prodCnt = sc.nextInt();
		maxWeight = sc.nextInt();

		Prod[] prod = new Prod[prodCnt+1];

		int[][] arr = new int[prodCnt + 1][maxWeight + 1];

		for (int i = 1; i < prodCnt + 1; i++) {
			int weight = sc.nextInt();
			int value = sc.nextInt();
			prod[i]=new Prod(weight,value);
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = 0;
		}
		for (int i = 0; i < arr[0].length; i++) {
			arr[0][i] = 0;
		}

		nomalBag(prod, arr, 1);

		System.out.println(result);
	}

	private static void nomalBag(Prod[] prod, int[][] arr, int cnt) {
		for (int i = cnt; i < prodCnt + 1; i++) {
			for (int j = 1; j < maxWeight + 1; j++) {
				if(prod[i].weight<=j) {
					if((prod[i].value + arr[i-1][j-prod[i].weight])>arr[i-1][j]) {
						arr[i][j]=prod[i].value + arr[i-1][j-prod[i].weight];
						result=Math.max(result, prod[i].value + arr[i-1][j-prod[i].weight]);
					}else {
						arr[i][j]=arr[i-1][j];
						result=Math.max(result, arr[i-1][j]);
					}
				}else {
					arr[i][j]=arr[i-1][j];
					result=Math.max(result, arr[i-1][j]);
				}
			}
		}
	}
}
class Prod {
	public int weight;
	public int value;
	public Prod(int weight,int value) {
		this.weight=weight;
		this.value=value;
	}
}
