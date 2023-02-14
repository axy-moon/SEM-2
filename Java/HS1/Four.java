import java.util.Scanner;

public class Four {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type 1 if you are female and 2 if male: ");
        int ch = sc.nextInt();

        System.out.print("How tall are you?\nNumber of Feet: ");
        int ft = sc.nextInt();

        System.out.print("Number of Inches: ");
        int inch = sc.nextInt();
        int wt=0;
        if(ch==1) {
            if(ft>=5 && inch>0)
               wt = 100 + 6*inch;
            else
               wt = 100; 

        }
        else if (ch==2) {
            if(ft>=5 && inch>0)
                wt = 106 + 7*inch;
            else
                wt = 106;
        }
        System.out.println("You should weigh "+ wt + " pounds");
    }

}