import java.util.*;
public class LuckyPrize {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        while(true) 
        {   System.out.print("Student Name: ");
            String input = sc.nextLine();
            if(input.equals("quit")) 
                break; 
            else 
                names.add(input);}
        ArrayList<String> Dnames = new ArrayList<String>();
        System.out.println("======Student Names=====\n");
        for(String name : names) {
            if(!Dnames.contains(name)) {
                System.out.println(name);
                Dnames.add(name);}}
        Random randint = new Random();
        System.out.println("\nLucky Winner is " + Dnames.get(randint.nextInt(Dnames.size())));}}