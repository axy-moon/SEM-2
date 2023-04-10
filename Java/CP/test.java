import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {
    char[] password = new char[100];
    Random rand = new Random();
    static int flag=0;
    String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lower="abcdefghijklmnopqrstuvwxyz";
    String number="1234567890";
    String symbol="!@#$%^&*()_+";
    String combined=upper+lower+number=symbol;
void Generate(int length, char upAns, char numAns, char spAns)
{
    if(upAns=='y' &&  numAns=='y' && spAns=='y') {
        flag=1;
        password[0]=upper.charAt(rand.nextInt(upper.length()));
        password[1]=number.charAt(rand.nextInt(number.length()));
        password[2]=symbol.charAt(rand.nextInt(symbol.length()));

        for(int k=3; k<length; k++) {
            password[k]=lower.charAt(rand.nextInt(lower.length()));
        }

    }

    if(upAns=='n' &&  numAns=='y' && spAns=='y') {
        password[0]=lower.charAt(rand.nextInt(lower.length()));
        password[1]=number.charAt(rand.nextInt(number.length()));
        password[2]=symbol.charAt(rand.nextInt(symbol.length()));

        if(length>3) {
            for(int k=3; k<length; k++) {
                password[k]=lower.charAt(rand.nextInt(lower.length()));
            }

        }
    }

    if(upAns=='y' &&  numAns=='n' && spAns=='y') {
        password[0]=upper.charAt(rand.nextInt(number.length()));
        password[1]=lower.charAt(rand.nextInt(lower.length()));
        password[2]=symbol.charAt(rand.nextInt(symbol.length()));

        if(length>3) {
            for(int k=3; k<length; k++) {
                password[k]=lower.charAt(rand.nextInt(lower.length()));
            }
        }
    }

    if(upAns=='y' &&  numAns=='y' && spAns=='n') {
        password[0]=upper.charAt(rand.nextInt(number.length()));
        password[1]=lower.charAt(rand.nextInt(lower.length()));
        password[2]=number.charAt(rand.nextInt(number.length()));

        if(length>3) {
            for(int k=3; k<length; k++) {
                password[k]=lower.charAt(rand.nextInt(lower.length()));
            }
        }
    }

    if(upAns=='n'&&  numAns=='n' && spAns=='n')

    {   flag=-1;
        for(int k=0; k<length; k++)
        {
            password[k]=lower.charAt(rand.nextInt(lower.length()));

        }
        System.out.println("Printing the random generated password...");


    }
    for(int k=0; k<length; k++)
    {
        System.out.print(password[k]);
    }
//    return new char[0];
}


void Strength(int length)
{
    System.out.println();
    System.out.println("Checking the strength of the password...");
    if(flag==1 && ((length>=8)&&(length<=16)))
        System.out.println("It is a Decent password");
    if(flag==1 && length>=16)
        System.out.println("It is a Good password");
    if(flag==-1)
        System.out.println("It is a Very weak password ");
    if(flag==0)
        System.out.println("It is a Weak password");
}

void Information()
{
    System.out.println();
    System.out.println("AWARENESS TO USERS ABOUT PASSWORD");
    System.out.println("Avoid using the same password twice");
    System.out.println("Avoid character repetition, keyboard patterns");
    System.out.println("Avoid Dictionary words, letter or number sequences as well");
}
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int length;

        System.out.println("Enter the desired length of the password(greater than 2): ");
        length=sc.nextInt();

        System.out.println("Do you wish to have UpperCase letters? (y/n): ");
        char upAns=sc.next().charAt(0);

        System.out.println("Do you wish to have numbers? (y/n): ");
        char numAns=sc.next().charAt(0);

        System.out.println("Do you wish to have Special letters? (y/n): ");
        char spAns=sc.next().charAt(0);

        PasswordGenerator p = new PasswordGenerator();
        p.Generate(length,upAns,numAns,spAns);
        p.Strength(length);
        p.Information();


    }

}
