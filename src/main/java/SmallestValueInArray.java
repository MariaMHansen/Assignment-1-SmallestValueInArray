import java.util.Arrays;

public class SmallestValueInArray {
    public static int findSmallest(final int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
}



