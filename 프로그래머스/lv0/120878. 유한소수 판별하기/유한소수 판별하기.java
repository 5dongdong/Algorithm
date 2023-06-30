import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int gcd = getGCD(a, b);
        b = b / gcd;
        
        // b의 소인수 분해
        while (b % 2 == 0) {
            b /= 2;
        }
        
        while (b % 5 == 0) {
            b /= 5;
        }
        
        if (b == 1) {
            return 1; // 유한소수인 경우
        } else {
            return 2; // 무한소수인 경우
        }
    }

    public static int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a % b);
    }
}
