import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[5];

		for(int i = 0; i< 5; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int sum = 0;

		for (int i = 0; i <5 ; i++) {
			sum += arr[i];
		}
		System.out.println(sum/arr.length);

		System.out.println(arr[arr.length/2]);


	}
}