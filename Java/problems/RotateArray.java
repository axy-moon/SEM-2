import java.util.Scanner;

public class RotateArray {
    public static void main(String args[]) {
        System.out.print("Enter the size of the array: ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        int d=0;
        System.out.print("No of Rotation: ");
        d = sc.nextInt();

        int temp[] = new int[size];
        int k=0;
        for(int i = d;i<size;i++){
            temp[k] = arr[i];
            k++;
        }

        for(int i=0;i<d;i++) {
            temp[k] = arr[i];
            k++;
        }

        System.out.println("Rotated Array ");

        for(int i=0;i<size;i++){
            System.out.print(temp[i] + " ");
        }

    }
}