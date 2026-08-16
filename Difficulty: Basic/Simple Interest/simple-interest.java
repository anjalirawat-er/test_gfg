import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        double simpleInterest = (double)(p * r * t) / 100.0;

        System.out.printf("%.2f\n", simpleInterest);
    }
}