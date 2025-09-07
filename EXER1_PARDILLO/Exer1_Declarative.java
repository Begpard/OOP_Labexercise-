import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exer1_Declarative {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        System.out.println("Declarative Programming:");
        System.out.println("Original numbers: " + numbers);
        
        // Filter even numbers, square them, and sum using declarative approach
        int sum = numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * n)
                        .reduce(0, Integer::sum);
        
        System.out.println("Sum of squares of even numbers: " + sum);
        
        // Find maximum even number
        Optional<Integer> maxEven = numbers.stream()
                                         .filter(n -> n % 2 == 0)
                                         .max(Integer::compare);
        
        System.out.println("Maximum even number: " + maxEven.orElse(null));
    }
}
