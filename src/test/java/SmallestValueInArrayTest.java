import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SmallestValueInArrayTest {
    @DisplayName("Find smallest int in int [] ")
    @Test
    void Should_ReturnSmallest_When_GivenArray() {
    int number = SmallestValueInArray.findSmallest(new int[] {4,8,2,7,4,9,7});
    Assertions.assertEquals(2, number);
    }
}