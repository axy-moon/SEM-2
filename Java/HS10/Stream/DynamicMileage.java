import java.io.*;
import java.util.*;

public class DynamicMileage {
    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);

        File output = new File("dm.txt");
        FileWriter writer = new FileWriter(output,true);

        System.out.print("Enter the No of Records: ");
        int nor = sc.nextInt();



        for(int i=0;i<nor;i++) {
            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Price per Gallon: ");
            double ppg = sc.nextDouble();

            System.out.print("Price for Fillup: ");
            double pf = sc.nextDouble();

            System.out.print("Initial Odometer: ");
            int inOd = sc.nextInt();

            System.out.print("Final Odometer: ");
            int finOd = sc.nextInt();

            writer.write("\n"+name+"\t"+ppg+"\t"+pf+"\t"+inOd+"\t"+finOd);
            
        }        
        

        
        
        writer.close();


        
    }
}