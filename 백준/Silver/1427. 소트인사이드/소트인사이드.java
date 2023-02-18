import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		Integer[] arr = new Integer[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i) - '0';
		}

		Arrays.sort(arr,Comparator.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}




	}
}