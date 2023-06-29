package s2_exception;

public class s2 {
    public static void main(String[] args) {

        s2_1();

    }

    public static void s2_1() {
        // Если необходимо,исправьте данный код
        try {
            int d = 0;
            int[] intArray = new int[5];
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
