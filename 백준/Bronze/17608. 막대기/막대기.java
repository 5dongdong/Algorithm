import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
        for(int i  = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt = 1;
        int max = arr[x -1];
        for(int i = x -2; i >= 0; i--) {
            if(arr[i] > max) {
                max = arr[i];
                cnt++;
            }
        }
        System.out.println(cnt);
        }
    }
