import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int answer = 0;
		int hun = 0;
		int ten = 0;
		int one = 0;

		if (N < 100) {
			answer = N;
		}
		else
		answer = 99;
		for (int i = 100; i <= N; i++) {

			hun = i / 100;
			ten = (i % 100) / 10;
			one = i % 10;
			if (hun - ten == ten - one) {
				answer++;
			}
		}


		System.out.println(answer);
	}
}