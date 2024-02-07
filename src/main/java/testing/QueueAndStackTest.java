package testing;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueAndStackTest {

    public static void main(String[] args) {
        //Queue<String > q = new LinkedList<>();

        Stack<String> q = new Stack<>();

        q.add("Apple");
        q.add("Banana");
        q.add("Orange");
        q.add("grape");
        q.add("Strawberry");

        System.out.println(q);
        String abc = q.pop(); //will print
        //String abc = q.peek();
        System.out.println(q.search("Banana"));
       // boolean abc = q.empty();
        System.out.println(q);
        System.out.println(abc);
        //Threads - grasp
    }

}
