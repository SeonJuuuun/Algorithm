import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int K;
	static int arr[][];
	static boolean visited[];
	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine());
		arr = new int[N + 1][N + 1];
		visited = new boolean[N + 1];
		count = 0;
		for (int i = 1; i <= K; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] = 1;
		}

		dfs(1);

		System.out.println(count - 1);

	}

	static void dfs(int num) {
		visited[num] = true;
		count++;
		for (int i = 1; i <= N; i++) {
			if(arr[num][i] == 1 && !visited[i]){
				dfs(i);
			}

		}

	}
}