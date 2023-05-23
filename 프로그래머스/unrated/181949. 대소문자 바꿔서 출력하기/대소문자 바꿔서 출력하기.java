import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder answer = new StringBuilder();

        for (char x : a.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer.append(Character.toUpperCase(x));
            } else if (Character.isUpperCase(x)) {
                answer.append(Character.toLowerCase(x));
            } else {
                answer.append(x);
            }
        }
        System.out.println(answer.toString());
    }
}      