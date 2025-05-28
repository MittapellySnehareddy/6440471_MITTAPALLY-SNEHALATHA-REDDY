package javaexcercises;
public class TypeCastingExample {
    public static void main(String[] args) {
        double myDouble = 45.67;
        int myInt = (int) myDouble;

        int anotherInt = 100;
        double anotherDouble = (double) anotherInt;

        System.out.println("Double to int: " + myInt);
        System.out.println("Int to double: " + anotherDouble);
    }
}
