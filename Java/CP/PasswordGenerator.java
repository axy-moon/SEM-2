import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String symbols = "!@#$%^&*()_";
        String all = lower+upper;

        Scanner sc = new Scanner(System.in);
        while(true) {
            
            System.out.println("=======PASSWORD MANAGER==========");
            System.out.println("|   1.GENERATE PASSWORD         |");
            System.out.println("|   2.PASSWORD STRENGTH CHECK   |");
            System.out.println("=================================");
            System.out.print("\n\nEnter your Option: ");
            int ch = sc.nextInt();

            if(ch==1) {
                System.out.print("Length of the Password: ");
                int len = sc.nextInt();
                System.out.println();
                char[] password = new char[len];
                Random randint = new Random();
                password[0] = upper.charAt(randint.nextInt(upper.length()));
                password[1] = lower.charAt(randint.nextInt(lower.length()));
                password[len-1] = symbols.charAt(randint.nextInt(symbols.length()));

                for(int i=2;i<len-1;i++) {
                    password[i] = all.charAt(randint.nextInt(all.length()));
                }

                for(int i=0;i<len;i++)
                System.out.print(password[i]);

                System.out.println();
            }
            
            else if(ch==2) {
                System.out.print("Enter Password: ");
                Scanner st = new Scanner(System.in);
                String pass = st.nextLine();

                for(int i=0;i<)

                System.out.println((int)pass.charAt(5));
                     
            }

            else {
                System.out.println("Invalid Option");
            }
            
        }
    }

}
