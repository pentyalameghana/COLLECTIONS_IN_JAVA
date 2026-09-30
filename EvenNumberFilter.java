import java.util.ArrayList;
import java.util.List;

public class EvenNumberFilter {

    public static List<Integer> filterEven(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                result.add(number);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 8, 9);

        System.out.println(filterEven(numbers));
    }
}