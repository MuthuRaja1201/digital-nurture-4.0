public class TypeCastingExample {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble;
        System.out.println("Double to int: " + myInt);

        int num = 100;
        double convertedDouble = num;
        System.out.println("Int to double: " + convertedDouble);
    }
}
