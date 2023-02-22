import java.util.*;

public class GymScores {
    public static void main(String[] args)
    {
        int size = 6;
        float[] arr = new float[size];

        for(int i=0;i<size;i++)
            arr[i] = Float.parseFloat(args[i]);

        Arrays.sort(arr);
        float sum = 0;
        for(int i=1;i<size-1;i++)
        {
            sum += arr[i];
        }

        System.out.println("Average: " + sum/4);


    }

}