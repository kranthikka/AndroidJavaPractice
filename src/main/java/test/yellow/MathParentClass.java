package test.yellow;

public class MathParentClass {

    //overloading
    public int add(int a, int b) {
        return a + b;
    }

    //overloading
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int multiplication(int a, int b) {
        return a * b * 0; //overriding in child class
    }

}
