import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static int[][] map;
	public static int minus = 0;
	public static int one = 0;
	public static int zero = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		partition(0, 0, N);

		System.out.println(minus);
		System.out.println(zero);
		System.out.println(one);
	}

	public static void partition(int row, int col, int size) {

		if (colorCheck(row, col, size)) {
			if (map[row][col] == -1) {
				minus++;
			} else if (map[row][col] == 0) {
				zero++;
			} else {
				one++;
			}
			return;
		}

		int newSize = size / 3;

		partition(row, col, newSize);
		partition(row, col + newSize, newSize);
		partition(row, col + newSize + newSize, newSize);

		partition(row + newSize, col, newSize);
		partition(row + newSize, col + newSize, newSize);
		partition(row + newSize, col + newSize + newSize, newSize);


		partition(row + newSize + newSize, col, newSize);
		partition(row + newSize + newSize, col + newSize, newSize);
		partition(row + newSize + newSize, col + newSize + newSize, newSize);

	}

	public static boolean colorCheck(int row, int col, int size) {
		int color = map[row][col];

		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if (map[i][j] != color) {
					return false;
				}
			}
		}
		return true;
	}

}