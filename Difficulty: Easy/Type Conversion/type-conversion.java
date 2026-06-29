import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextDouble()) {
            double d = sc.nextDouble();
            
            int result = (int) d;
            
            System.out.println(result);
        }
        sc.close();
    }
}
