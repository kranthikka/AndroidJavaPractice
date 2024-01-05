package testing;

import jdk.internal.org.objectweb.asm.tree.IincInsnNode;

import java.util.ArrayList;

public class CollectionsTest {

    public static void main(String[] args) {
        ArrayList<String> dishes = new ArrayList<>();

        dishes.add("aa");
        dishes.add("bb");
        dishes.add("cc");
        dishes.add("dd");

        //for loop
        for (int i=0; i<dishes.size(); i++){
            System.out.println(dishes.get(i));
        }

        //while loop
        int j = 0;
        while (j < dishes.size()) {
            System.out.println(dishes.get(j));
            j++;
        }

    }
}
