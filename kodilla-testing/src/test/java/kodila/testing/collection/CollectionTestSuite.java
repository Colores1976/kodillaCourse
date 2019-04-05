package kodila.testing.collection;
import kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    private static int testcounter = 0;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("We start the tests.");
    }
    @AfterClass
        public static void afterAllTests() {
            System.out.println("All tests are finished.");
    }
    @Before
        public void beforeEvryTest(){
        testcounter++;
        System.out.println("I start another partial test. Test number: " + testcounter);
    }
    @After
        public void afterEvryTest(){
        System.out.println("I finished this partial test.");
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(5);
        numbers.add(4);
        numbers.add(2);
        numbers.add(10);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(2);
        expected.add(10);
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList < Integer > result = exterminator.oddNumbersExterminator(numbers);
        //Then
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList < Integer > result = exterminator.oddNumbersExterminator(numbers);

        //Then
        Assert.assertEquals(expected, result);
    }
}
