package testing;

/*Write a method that takes 2 parameters: an ArrayList<String> list,
and an int numRepeats representing the number of times to repeat each element in the array.
Return a new ArrayList with each element repeated numRepeats times.

For example, if we had an ArrayList<String> list with the values [“hello”, “world”]:
repeatElements(list, 3)
Should return a new ArrayList with the elements:

["hello", "hello", "hello", "world", "world","world"]*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MultipleParametersTest {

/*    public void para(ArrayList<String> list, Integer number) {
        ArrayList<String> xyz = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < number; j++) {
                xyz.add(list.get(i));
            }
        }
        System.out.println(Collections.nCopies(4, list.get(0)));
        //System.out.println(Collections.nCopies(4, Arrays.asList(xyz.get(1))));
        System.out.println(xyz);
    }*/

    public static void main(String[] args) {
        ArrayList<String> abc = new ArrayList<>(Arrays.asList("hello", "World"));
        MultipleParametersTest mul = new MultipleParametersTest();
        mul.printRepeat(abc, 5);
    }

    public void printRepeat(ArrayList<String> list, int number) {
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < number; j++) {
                output.add(list.get(i));
            }
        }
        System.out.println(output);
    }
}
