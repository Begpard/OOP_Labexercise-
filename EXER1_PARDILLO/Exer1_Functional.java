import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Optional;

public class Exer1_Functional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        System.out.println("Functional Programming:");
        System.out.println("Original numbers: " + numbers);
        
        // Define functional components
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Function<Integer, Integer> square = n -> n * n;
        Function<List<Integer>, Integer> sumSquaresOfEvens = list -> 
            list.stream()
                .filter(isEven)
                .map(square)
                .reduce(0, Integer::sum);
        
        // Use higher-order functions
        int result = processNumbers(numbers, isEven, square, sumSquaresOfEvens);
        System.out.println("Sum of squares of even numbers: " + result);
        
        // Another functional approach with composition
        Function<List<Integer>, Optional<Integer>> findMaxEven = list ->
            list.stream()
                .filter(isEven)
                .max(Integer::compare);
        
        Optional<Integer> maxEven = findMaxEven.apply(numbers);
        System.out.println("Maximum even number: " + maxEven.orElse(null));
    }
    
    // Higher-order function that takes functions as parameters
    private static int processNumbers(List<Integer> numbers,
                                    Predicate<Integer> filter,
                                    Function<Integer, Integer> mapper,
                                    Function<List<Integer>, Integer> processor) {
        return processor.apply(numbers);
    }
}
