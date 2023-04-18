import java.io.*;
import java.util.*;

public class CarMileage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DataOutputStream out = new DataOutputStream(new FileOutputStream("Mileage"));

		System.out.println("Name: ");
		String name = sc.nextLine();

		System.out.println("Price per Gallon: ");
		double ppg = sc.nextDouble();

		System.out.println("Price for Fillup: ");
		double pf = sc.nextDouble();

		System.out.println("Initial Odometer: ");
		int inOdo = sc.nextInt();

		System.out.println("Final Odometer: ");
		int finOdo = sc.nextInt();


		out.writeLine(name);
		out.writeChar('\t');
		out.writeDouble(ppg);
		out.writeChar('\t');
		out.writeDouble(pf);
		out.writeInt(inOdo);


	}

}