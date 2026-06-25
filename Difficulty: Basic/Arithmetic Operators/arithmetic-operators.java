import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        // code here
        int p,q,r,s,t;
        p=x+y;
        q=x-y;
        r=x*y;
        s=x/y;
        t=x%y;

        // The below code prints the output
        System.out.println(p + " " + q + " " + r + " " + s + " " + t);
    }
}