import java.util.Hashtable;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
    Hashtable<String,String> mx = new Hashtable<>();

    Scanner sc = new Scanner(System.in);


    mx.put("22mx108","Axy");
    mx.put("22mx113","Ramesh");
    mx.put("22mx116","Nagul");


    System.out.println("\nRoll No: ");
    String roll = sc.next();

    System.out.println("Value for " + roll + ": " + mx.get(roll)); 
    
    }

}