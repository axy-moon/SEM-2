import java.util.Scanner;

public class Five {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the Sequence: ");
        int size = sc.nextInt();
        int[] sequence = new int[size];
        
        System.out.println("Enter Sequence: ");
        for (int i=0;i<size;i++) {
            sequence[i] = sc.nextInt();
            if(i>1) {
                if(sequence[i]<sequence[i-1]) {
                    System.out.println("Decreasing");
                    System.exit(0);
                }
                else
                    continue;
            }
        }
        System.out.println("Increasing");



    }
}