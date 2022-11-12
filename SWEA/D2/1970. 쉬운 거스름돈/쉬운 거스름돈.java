/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int tc = 1; tc <= T; tc++){

            int Price = sc.nextInt();
            int a = 0; //50,000
            int b = 0; //10,000
            int c = 0; //5,000
            int d = 0; //1,000
            int e = 0; //500
            int f = 0; //100
            int g = 0; //50
            int h = 0; //10

            a = Price/50000;
            Price -= 50000 * a;
            b = Price/10000;
            Price -= 10000 * b;
            c = Price/5000;
            Price -= 5000 * c;
            d = Price/1000;
            Price -= 1000 * d;
            e = Price/500;
            Price -= 500 * e;
            f = Price/100;
            Price -= 100 * f;
            g = Price/50;
            Price -= 50 * g;
            h = Price/10;
            Price -= 10 * h;

            System.out.format("#%d\n",tc);
            System.out.format("%d %d %d %d %d %d %d %d\n",a,b,c,d,e,f,g,h);
        }
	}
}