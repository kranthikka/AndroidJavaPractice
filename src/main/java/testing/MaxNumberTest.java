package testing;

/*Write a method that returns the maximum value in an ArrayList of Integers.
For example, if we had an ArrayList<Integer> list with the values [1, 2, 3, 4, 5]:

max(list)
Should return: 5
If there are no elements in the ArrayList,return 0.*/

import java.util.ArrayList;

public class MaxNumberTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(300);
        list.add(448);
        list.add(59);
        list.add(448);

        int maxValue = 0;

        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            if (maxValue < temp) {
                maxValue = temp;
            }
        }//end of loop

        System.out.println(maxValue);
    }

}//eoc
