import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30 };

        // Map to store counts for numbers 1 through 9
        Map<Integer, Integer> countMap = new HashMap<>();

        // Initialize map with 0 count
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        // Count how many numbers in the array are divisible by 1 to 9
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        // Print the final result
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + ": " + countMap.get(i));
        }
    }
}
