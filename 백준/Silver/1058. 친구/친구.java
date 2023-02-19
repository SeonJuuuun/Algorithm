import java.util.*;
import java.io.*;

public class Main {
	static char[][] arr;
	static boolean[][] check;
	static int[] result;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
		check = new boolean[N][N];
		result = new int[N];
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = s.charAt(j);
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 'Y' ){
				if(!check[i][j]) {
					check[i][j] = true;
					result[i]++;
				}

				for (int k = 0; k < N; k++) {
					if (!check[i][k] && arr[j][k] == 'Y' && i != k) {
						result[i]++;
						check[i][k] = true;
					}

				}
				}
			}
		}

		Arrays.sort(result);
		System.out.println(result[N - 1]);

	}

}


