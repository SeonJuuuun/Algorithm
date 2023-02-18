import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static int M;
	static int N;

	static int[][] arr;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		arr = new int[M][N];
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for (int j = x1; j < x2; j++) {     // 0 ~ 4
				for (int q = y1; q < y2; q++) {  // 2 ~ 4
					arr[q][j] = 1;
				}
			}
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 0) {
					count = 0;
					dfs(i, j);
					list.add(count);
				}
			}
		}

		Collections.sort(list);
		System.out.println(list.size());

		for (int i : list) {
			System.out.print(i + " ");
		}

	}

	public static void dfs(int x, int y) {
		arr[x][y] = 1;
		count++;
		for (int i = 0; i < 4; i++) {
			int next_x = x + dx[i];
			int next_y = y + dy[i];

			if (next_x >= 0 && next_x < M && next_y >= 0 && next_y < N) {
				if (arr[next_x][next_y] == 0) {
					dfs(next_x, next_y);
				}
			}
		}

	}
}