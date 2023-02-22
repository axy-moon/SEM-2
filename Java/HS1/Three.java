import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class Three {
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("No of Pupils: ");
        int size = sc.nextInt();

        float[] cls = new float[size];


        for (int i=0;i<size;i++) {
            cls[i] = sc.nextFloat();
        }

        Arrays.sort(cls);
        for (int i=0;i<size;i++) {
            int count = 1;
            for(int j=i+1;j<size;j++) {
                if(cls[i]==cls[j]) {
                count+=1;
                i = i+1; }
                else
                    break;

            }
            
            System.out.println(cls[i]+ "\t" + count);
        }
    }
}