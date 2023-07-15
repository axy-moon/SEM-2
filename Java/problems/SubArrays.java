import java.util.*;

public class SubArrays {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6};
        int k = 3;
        for(int i=0;i<=arr.length-k;i++){
            System.out.print("[ ");
            for(int j=i;j<i+k;j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println("]");

        }
    }
}