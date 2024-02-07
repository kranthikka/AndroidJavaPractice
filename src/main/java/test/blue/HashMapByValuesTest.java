package test.blue;

import java.util.*;

public class HashMapByValuesTest {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Apple", 1);
        map.put("Grapes", 3);
        map.put("Banana", 2);
        map.put("Oranges", 4);

        System.out.println(map);
    }



/*    public static void main(String[] args) {
        // Step 1: Create and populate HashMap
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("John", 30);
        unsortedMap.put("Alice", 25);
        unsortedMap.put("Bob", 35);
        unsortedMap.put("Charlie", 28);

        // Step 2: Convert HashMap entries to List
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());

        // Step 3: Sort the List based on values
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        // Step 4: Create a new LinkedHashMap to store the sorted entries
        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        // Step 5: Put sorted entries into the new LinkedHashMap
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted map
        System.out.println("Sorted HashMap by value: " + sortedMap);
    }*/
}
