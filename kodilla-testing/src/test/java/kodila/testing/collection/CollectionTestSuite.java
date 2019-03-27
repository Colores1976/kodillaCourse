package kodila.testing.collection;
import kodilla.testing.collection.OddNumbersExterminator;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(5);
        numbers.add(4);
        numbers.add(2);
        numbers.add(10);
        //When
        ArrayList<Integer> result = new ArrayList<>();
        result.add(numbers.oddNumbersExterminator());
        //Assert
        Assert.assertEquals(ArrayList < Integer > numbers, ArrayList < Integer > result);
    }
}
