import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static Queue<Integer> queue;
	static int n;
	static int k;
	static boolean[] visited = new boolean[100001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		k = sc.nextInt();

		if (n == k) {
			System.out.println(0);
		} else {
			bfs(n);
		}

	}

	static void bfs(int start) {
		queue = new LinkedList<>();
		queue.add(start);
		visited[start] = true;
		int count = 0;

		while (!queue.isEmpty()) {
			count++;
			int size = queue.size();


			for (int i = 0; i < size; i++) {
				int temp = queue.poll();
				if (temp - 1 == k || temp + 1 == k || temp * 2 == k) {
					System.out.println(count);
					return;
				}
				if (temp - 1 >= 0 && !visited[temp - 1]) {
					visited[temp - 1] = true;
					queue.add(temp - 1);
				}
				if (temp + 1 <= 100000 && !visited[temp + 1]) {
					visited[temp + 1] = true;
					queue.add(temp + 1);
				}
				if (temp * 2 <= 100000 && !visited[temp * 2]) {
					visited[temp * 2] = true;
					queue.add(temp * 2);
				}

			}

		}
	}

}




