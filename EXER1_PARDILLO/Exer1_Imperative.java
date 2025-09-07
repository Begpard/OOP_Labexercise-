import java.util.Arrays;
import java.util.List;

public class Exer1_Imperative {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        System.out.println("Imperative Programming:");
        System.out.println("Original numbers: " + numbers);
        
        // Filter even numbers, square them, and sum
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number % 2 == 0) {
                int squared = number * number;
                sum += squared;
            }
        }
        
        System.out.println("Sum of squares of even numbers: " + sum);
        
        // Find maximum even number
        int maxEven = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number % 2 == 0 && number > maxEven) {
                maxEven = number;
            }
        }
        
        System.out.println("Maximum even number: " + (maxEven != Integer.MIN_VALUE ? maxEven : "None"));
    }
}
