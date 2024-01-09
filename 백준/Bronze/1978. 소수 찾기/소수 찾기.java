import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int count = 0;

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            if (isPrime(a)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPrime(int num) {
        if(num == 1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
