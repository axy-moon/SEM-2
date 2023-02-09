import java.util.Scanner;

public class bmi {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Weight(in Kgs) : ");
        int wt = input.nextInt();
        String male = "Male";
        String fem = "Female";

        System.out.print("Height(in mtrs) : ");
        float ht = input.nextFloat();

        System.out.print("Gender : ");
        String gen = input.next();

        float bmi = wt/(ht*ht);
        System.out.println("BMI: " + bmi);

        if(bmi >= 27.8 && gen==male)
            System.out.println("Obesity");
        else if(bmi>=25 && gen==fem)
            System.out.println("Obesity");
        else
            System.out.println("Standard");

    }
}