import java.util.*;

public class SumOfSub {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 3;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {
            int curSum = 0;

            for (int j = i; j < i + k; j++) {
                curSum += arr[j];
            }

            if (curSum > max) {
                max = curSum;
            }
        }

        System.out.println("Max: " + max);
    }
}