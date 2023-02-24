import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int answer = 0;
	static int[] arr;
	static int N;
	static int S;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dfs(0, 0);
		System.out.println(S==0? answer-1 : answer);

	}

	static void dfs(int depth, int sum) {
		if (depth == N) {
			if (sum == S) {
				answer++;

			}
			return;
		}

		dfs(depth + 1, sum + arr[depth]);
		dfs(depth + 1, sum);
	}
}
