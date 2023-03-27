public class TenExceptions {
    public static void main(String[] args) {
        try {
            /* int divide = 5/0;
            int[] a = new int[5];
            a[6] = 10; */

            String a = null;
            System.out.println(a.length());
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
            System.out.println("");
        }

    }
}