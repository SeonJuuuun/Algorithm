import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	final static int Max = 25 + 10;

	static int n;
	static int[][] graph;
	static boolean[][] visited;
	static int countPerDanji;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		graph = new int[Max][Max];
		visited = new boolean[Max][Max];

		for (int i = 1; i <= n; i++) {
			String input = sc.next();
			for (int j = 1; j <= n; j++) {
				graph[i][j] = input.charAt(j - 1) - '0';
			}

		}

		ArrayList<Integer> countList = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (graph[i][j] == 1 && !visited[i][j]) {
					countPerDanji = 0;
					dfs(i, j);
					countList.add(countPerDanji);
				}
			}
		}

		System.out.println(countList.size());
		Collections.sort(countList);
		for (Integer integer : countList) {
			System.out.println(integer);
		}

	}

	static void dfs(int x, int y) {
		visited[x][y] = true;
		countPerDanji++;

		for (int i = 0; i < 4; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];
			if (!visited[newX][newY] && graph[newX][newY] == 1) {
				dfs(newX, newY);
			}
		}

	}
}