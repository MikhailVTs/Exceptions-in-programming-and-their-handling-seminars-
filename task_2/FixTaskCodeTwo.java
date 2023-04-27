/**
 * 
 * 2. Если необходимо, исправьте данный код
 * (задание 2
 * https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 * 
 * Код из задания № 2
 * 
 * try {
 *      int d = 0;
 *      double catchedRes1 = intArray[8] / d;
 *      System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 *      System.out.println("Catching exception: " + e);
 * }
 * 
 */

public class FixTaskCodeTwo {

    public static void main(String[] args) {
        try {
            int[] intArray = { 4, 5, 3, 6, 1, 2, 5, 7, 12 };
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

}
