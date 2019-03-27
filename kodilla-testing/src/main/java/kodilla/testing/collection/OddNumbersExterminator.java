package kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> oddNumbersExterminator( ArrayList<Integer> numbers ) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int a = numbers.get(i);
            if (a % 2 == 1) {
                evenList.add(a);
            }
        }
        return evenList;
    }
}

