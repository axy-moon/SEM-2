import java.io.*;

public class DataInputOutput {
	public static void main(String[] args) {
		DataOutputStream out = new DataOutputStream(new FileOutputStream("invoice"));

		int[] prices = {10,20,20,23,45};
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
       
        // read it in again
        DataInputStream in = new DataInputStream(new
                FileInputStream("invoice"));
       
        double price;
        int unit;
        StringBuffer desc;
        double total = 0.0;
       
        String lineSepString = System.getProperty("line.separator");
        char lineSep = lineSepString.charAt(lineSepString.length()-1);
       
        try {
            while (true) {
                price = in.readDouble();
                in.readChar();       // throws out the tab
                unit = in.readInt();
                in.readChar();       // throws out the tab
                char chr;
                desc = new StringBuffer(20);
                while ((chr = in.readChar()) != lineSep)
                    desc.append(chr);
                System.out.println("You've ordered " +
                        unit + " units of " +
                        desc + " at $" + price);
                total = total + unit * price;
            }
        } catch (EOFException e) {
        }
        System.out.println("For a TOTAL of: $" + total);
        in.close();
    }
}
