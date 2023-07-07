import java.util.*;
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a ,b));
        System.out.println(lcm(a ,b));
        
    }
    
    private static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    private static int lcm(int x, int y) {
        return (x * y) / gcd(x , y);
    }
}