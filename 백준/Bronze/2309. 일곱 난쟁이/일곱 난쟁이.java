import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int total = 0;
        int targetSum;

        for (int i = 0; i < 9; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
            total += number;
        }
        targetSum = total - 100;

        boolean found = false;
        for (int i = 0; i < numbers.size() - 1 && !found; i++) {
            for (int j = i + 1; j < numbers.size() && !found; j++) {
                if (numbers.get(i) + numbers.get(j) == targetSum) {
                    numbers.remove(j);
                    numbers.remove(i);
                    found = true;
                }
            }
        }
        scanner.close();

        Collections.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
