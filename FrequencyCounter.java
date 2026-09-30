import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {

    public static Map<String, Long> countFrequencies(List<String> items) {
        Map<String, Long> result = new HashMap<>();

        for (String item : items) {
            result.put(item, result.getOrDefault(item, 0L) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> items = List.of(
            "Java",
            "SQL",
            "Java",
            "HTML",
            "SQL",
            "Java"
        );

        System.out.println(countFrequencies(items));
    }
}