import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[][] map;
	static int M;
	static int N;
	static boolean[][] visited;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());



		for (int i = 0; i < T; i++) {

			String[] s = br.readLine().split(" ");
			M = Integer.parseInt(s[0]);
			N = Integer.parseInt(s[1]);
			int K = Integer.parseInt(s[2]);
			map = new int[M][N];
			visited = new boolean[M][N];
			for (int j = 0; j < K; j++) {
				String[] s1 = br.readLine().split(" ");
				int x = Integer.parseInt(s1[0]);
				int y = Integer.parseInt(s1[1]);
				map[x][y]=1;
			}
			int count =0;

			for (int j = 0; j < M; j++) {
				for (int k = 0; k < N; k++) {
					if(map[j][k] == 1 && !visited[j][k]){
						dfs(j,k);
						count++;
					}
				}
			}
			System.out.println(count);
			count = 0;
			
		}

	}

	public static void dfs(int x, int y) {
		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if(nextX >= 0 && nextY >= 0 && nextX < M && nextY < N){
				if(map[nextX][nextY] == 1 && !visited[nextX][nextY]){
						dfs(nextX,nextY);
				}
			}
		}



	}
}