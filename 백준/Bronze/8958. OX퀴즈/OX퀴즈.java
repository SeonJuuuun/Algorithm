import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		String[] arr = new String[N];

		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}

		for (int i = 0; i < N; i++) {
			int sum = 0;
			int plus = 0;

			for (int j = 0; j < arr[i].length(); j++) {

				if (arr[i].charAt(j) == 'O') {
					plus++;
				} else {
					plus = 0;
				}
				sum += plus;
				
			}
			System.out.println(sum);

		}

	
	}
}