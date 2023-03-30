import java.io.*;
public class TenExceptions {

    public static void display() {
        System.out.println("Dummy Function");
    }

    public static void main(String[] args) {
        try {
            /* int divide = 5/0;
            int[] a = new int[5];
            a[6] = 10; */

            String a = null;
            //System.out.println(a.length());
            display(a);
        }

        catch(ArithmeticException e) {
            System.out.println("Divide By Zero is not possible");
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index should be less than the size of the array");
        }


        catch(NullPointerException e) {
            System.out.println("Null Pointer error");
        }

        catch(IllegalArgumentException e) {
            System.out.println("Invalid Arguments given for the function");
        }

        catch (IOException e) {
            System.out.println("Invalid Input. Enter new value: ");
        }


    }
}