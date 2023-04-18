import java.io.*;

public class DataInputOutput {
	public static void main(String[] args) throws IOException {
		DataOutputStream out = new DataOutputStream(new FileOutputStream("invoice"));

		double[] prices = {10.00,20.00,20.76,23.55,45.55};
		int[] units = {12,41,23,15,65};

		   String[] descs = { "Java T-shirt","Java Mug","Duke Juggling Dolls","Java Pin","Java Key Chain"};
       
        for (int i = 0; i < prices.length; i ++) {
            out.writeDouble(prices[i]);
            out.writeChar('\t');
            out.writeInt(units[i]);
            out.writeChar('\t');
            out.writeChars(descs[i]);
            out.writeChar('\n');
        }
        out.close();
       
       
    }
}
