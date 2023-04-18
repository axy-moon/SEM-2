import java.io.*;

public class FileInputOutputStream {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("textfile.txt");
        File outputFile = new File("secondfile.txt");
    
        FileInputStream in = new FileInputStream(inputFile);
        FileOutputStream out = new FileOutputStream(outputFile);

        int c;

        while((c = in.read()) != -1) {
            System.out.print((char)c);
            out.write(c);
        }

        System.out.println("Success");

        in.close();
        out.close();

    }
}