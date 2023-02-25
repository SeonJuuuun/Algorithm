import java.util.*;
import java.io.*;

public class Main {
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[100][100];
		int count = 0;
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st=new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			for (int j = a; j < a+10; j++) {
				for (int k = b; k <b+10 ; k++) {
					arr[j][k] = 1;
				}

			}
		}

		for (int i = 0; i <100; i++) {
			for (int j = 0; j < 100; j++) {
				if(arr[i][j] == 1)
					count++;
			}
		}

		System.out.println(count);
	}
}