import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();  // 개행 문자 소비
        int cnt = tc;  // cnt 변수 초기화
        for (int i = 0; i < tc; i++) {
            String word = sc.nextLine();
            char[] wArr = word.toCharArray();
            for (int j = 0; j < wArr.length - 1; j++) {
                if (wArr[j] == wArr[j + 1]) {
                    continue;
                } else if (word.substring(j + 1).contains(String.valueOf(word.charAt(j)))) {
                    cnt--;
                    break;
                }
            }
        }
        System.out.println(cnt);
        }
    }


