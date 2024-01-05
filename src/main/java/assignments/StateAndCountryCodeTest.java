package assignments;

        /* Karnataka ,in
        New York, Us
        London, uk
        Maidenhead,uk
        Manchester,uk */

import java.util.HashMap;
import java.util.Scanner;

public class StateAndCountryCodeTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();

        map.put("karnataka", "IN");
        map.put("new york", "USA");
        map.put("london", "UK");
        map.put("maidenhead", "UK");
        map.put("manchester", "UK");

        System.out.println("Enter State: ");
        String state = scan.nextLine().toLowerCase();

        String countryCode = map.get(state);

        if (countryCode == null) {
            System.out.println("No result found for " + state);
        } else {
            System.out.println("Country code for " + "'" + state + "'" + " is " + "'" + countryCode + "'");
        }
    }

}
