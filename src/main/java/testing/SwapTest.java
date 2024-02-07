package testing;

/*Write a method that swaps the first and last elements in an ArrayList of Strings.
For example, if we had an ArrayList<String> list with the values [“hello”, “world”]:

swapFirstLast(list)
Should return an ArrayList with the elements:
["world","hello"] */

import java.util.ArrayList;
import java.util.Collections;

public class SwapTest {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("Hi");
        words.add("and");
        words.add("hello");
        words.add("world");
//      String a = words.get(0);

        //Collections class - using swap method to swap the first and last words
        Collections.swap(words,0,words.size()-1);
        System.out.println(words);
    }

}
