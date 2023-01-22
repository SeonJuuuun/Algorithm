import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int result[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        result[0] = arr[0];
        int sum = 0;

        for (int i = 1; i < arr.length; i++) {
             result[i] = result[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
             sum += result[i];
        }
        System.out.println(sum);



    }


}
