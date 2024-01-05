package testing;

import com.sun.xml.internal.ws.server.ServerRtException;
import static com.testing.ReverseTest.reverseWords;

public class AbstractTest3 {

    public static void main(String[] args) {
    /* AbstractTest2 abs = new AbstractTest2();
        abs.addition();
        abs.Sub(); */

        String name = "Kranthi";
        String text = "how are you";
        String age = "29";
        int x = 22;

        int a = name.length();
        String b = text.toUpperCase();
        String c = reverseWords(text);

        System.out.println(c);


        //System.out.println("My name length: " + text.length());
        //System.out.println(reverseWords(text.toUpperCase()));
        //System.out.println(reverseWords(text.toUpperCase()));
        //System.out.println(String.valueOf(age));
        //System.out.println(Integer.toString(a));
        //System.out.println(b);

        AbstractTest3 abs = new AbstractTest3();
        abs.getMessage("Kranthi", "Hi Kranthi, how are you");

    }

    String getMessage(String name, String message) {
        String output = "";
        if (message.toLowerCase().contains(name.toLowerCase())) {
            int index = message.toLowerCase().indexOf(name.toLowerCase() + ", ");
            output = message.substring(index);
        } else {
            output = "no message found for user with " + name;
        }
        System.out.println(output);
        return "";
    }
}
