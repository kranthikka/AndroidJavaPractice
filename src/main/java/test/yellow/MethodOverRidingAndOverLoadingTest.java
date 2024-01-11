package test.yellow;

public class MethodOverRidingAndOverLoadingTest extends MathParentClass {

    public static void main(String[] args) {
        MethodOverRidingAndOverLoadingTest methodOverRidingTest = new MethodOverRidingAndOverLoadingTest();
        methodOverRidingTest.add(1, 2, 3); //overloading
        methodOverRidingTest.add(1, 2); //overloading
        methodOverRidingTest.multiplication(2, 3);//overriding
    }

    @Override
    public int multiplication(int a, int b) { //Method overriding - overriding method in parent class
        return a * b;
    }
}
