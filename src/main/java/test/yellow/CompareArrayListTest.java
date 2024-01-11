package test.yellow;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> actualList = new ArrayList<>(Arrays.asList("Hello", "World", "test"));
        ArrayList<String> expectedList = new ArrayList<>(Arrays.asList("Hello", "World"));

        if (actualList.equals(expectedList)) {
            System.out.println("both list are matching");
        } else
            System.out.println("lists are not matching");
    }
}
