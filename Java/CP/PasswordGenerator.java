import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String number = "1234567890";
        String symbols = "!@#$%^&*()_";
        String all = lower+upper+number;
        Random randint = new Random();
        
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println();            
            System.out.println("=======PASSWORD MANAGER==========");
            System.out.println("|   1.GENERATE PASSWORD         |");
            System.out.println("|   2.PASSWORD STRENGTH CHECK   |");
            System.out.println("=================================");
            System.out.print("\n\nEnter your Option: ");
            int ch = sc.nextInt();

            if(ch==1) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Length of the Password: ");
                int len = sc.nextInt();

                char[] password = new char[len];        

                System.out.print("Uppercase Letters in Password: ");
                int upQ = sc.nextChar();
                
                System.out.print("Special Characters in Password: ");
                int syQ = sc.nextChar();

                System.out.print("Numbers in Password: ");
                int numQ = sc.nextChar();
                
                if(upQ=='y' &&  numQ=='y' && syQ=='y') {
                    password[0]=upper.charAt(randint.nextInt(upper.length()));
                    password[1]=number.charAt(randint.nextInt(number.length()));
                    password[2]=symbols.charAt(randint.nextInt(symbols.length()));

                for(int i=3; i<len; i++) {
                    password[i]=lower.charAt(randint.nextInt(lower.length()));
                }

                }
                if(upQ=='n' &&  numQ=='y' && syQ=='y') {
                    password[0]=lower.charAt(randint.nextInt(lower.length()));
                    password[1]=number.charAt(randint.nextInt(number.length()));
                    password[2]=symbols.charAt(randint.nextInt(symbols.length()));

                    if(len>3) {
                        for(int k=3; k<len; k++) {
                            password[k]=lower.charAt(randint.nextInt(lower.length()));
                        }

                }
    }
                if(upQ=='y' &&  numQ=='n' && syQ=='y') {
                    password[0]=upper.charAt(randint.nextInt(number.length()));
                    password[1]=lower.charAt(randint.nextInt(lower.length()));
                    password[2]=symbols.charAt(randint.nextInt(symbols.length()));

        if(len>3) {
            for(int k=3; k<len; k++) {
                password[k]=lower.charAt(randint.nextInt(lower.length()));
            }
        }
    }

    if(upQ=='y' &&  numQ=='y' && syQ=='n') {
        password[0]=upper.charAt(randint.nextInt(number.length()));
        password[1]=lower.charAt(randint.nextInt(lower.length()));
        password[2]=number.charAt(randint.nextInt(number.length()));

        if(len>3) {
            for(int k=3; k<len; k++) {
                password[k]=lower.charAt(randint.nextInt(lower.length()));
            }
        }
    }

            if(upQ=='n'&&  numQ=='n' && syQ=='n')

                {   
                for(int k=0; k<len; k++)
                {
                    password[k]=lower.charAt(randint.nextInt(lower.length()));

                }

            }
            
     }
            else if(ch==2) {
                boolean up = false,num = false,sym = false, minL = false;
                System.out.print("Enter Password: ");
                Scanner st = new Scanner(System.in);
                String pass = st.nextLine();
                if(pass.length()>8)
                    minL = true;

                for(int i=0;i<upper.length();i++) {
                    if (pass.contains(upper.charAt(i)))
                        up = true;
                        break; }
                for(int i=0;i<number.length();i++) {
                    if (pass.contains(number.charAt(i)))
                        num = true;
                        break; }
                for(int i=0;i<symbols.length();i++) {
                    if (pass.contains(symbols.charAt(i)))
                        sym = true;
                        break; }


                if(minL && up && num && sym && minL) 
                    System.out.println("Strong Password");
                else
                    System.out.println("Weak Password");
                
            }

            else {
                System.out.println("Invalid Option");
            }
            
        }
    }

}
