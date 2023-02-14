import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("<-- From Switch --> ");            

        switch(num) {
            case 0: 
            System.out.println("Sunday");
            break;

            case 1: 
            System.out.println("Monday");
            break;

            case 2: 
            System.out.println("Tuesday");
            break;

            case 3: 
            System.out.println("Wednesday");
            break;

            case 4: 
            System.out.println("Thursday");
            break;

            case 5: 
            System.out.println("Friday");
            break;
            
            case 6: 
            System.out.println("Saturday");
            break;

            default:
            System.out.println("Not a Valid Day");
        }

        System.out.println("<-- From IF Statement --> ");            

        if(num==0)
            System.out.println("Sunday");
        else if(num==1)
            System.out.println("Monday");
        else if(num==2)
            System.out.println("Tuesday");
        else if(num==3)
            System.out.println("Wednesday");
        else if(num==4)
            System.out.println("Thursday");
        else if(num==5)
            System.out.println("Friday");
        else if(num==6)
            System.out.println("Saturday");
        else
            System.out.println("Not a Valid Day");


    }
}