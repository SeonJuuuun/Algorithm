import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                int first = a * i + b * j;
                int second = d * i + e * j;

                if (first == c && second == f) {
                    System.out.print(i + " ");
                    System.out.print(j);
                    break;
                }
            }
        }

    }
}
