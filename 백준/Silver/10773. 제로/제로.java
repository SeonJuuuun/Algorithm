
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
6 5 4 3 2
 */

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(br.readLine());
			if(a == 0) {
				st.pop();
			}
			else {
				st.push(a);
			}
		}
		int sum = 0;
		while(!st.isEmpty()){
			sum += st.pop();
		}
		System.out.println(sum);



	}
}
