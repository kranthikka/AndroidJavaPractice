package assignments;

import java.util.*;
import java.util.stream.Collectors;

public class CountCharTest {

    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> myMap = new LinkedHashMap<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter sentence: ");
        //String name = "this my name is kkK";
        String name = scan.nextLine();
        char[] charArray = name.toCharArray();

        for (char letter : charArray) {
            if (myMap.containsKey(letter)) {
                int a = myMap.get(letter) + 1;
                myMap.put(letter, a);
            } else {
                myMap.put(letter, 1);
            }
        }
        System.out.println(myMap);
    }
}
