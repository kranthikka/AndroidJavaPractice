package test.yellow;

import java.util.ArrayList;

public class ExceptionsTest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Grapes");
        list.add("Orange");

        //Index Out Of Bound Exception because list size is 3
        try {
            System.out.println(list.get(4));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Null Pointer Exception
        String actual = null;
        String expected = "kranthi";
        if (actual.equalsIgnoreCase(expected)) {
            System.out.println("strings are equal");
        }
    }

}
