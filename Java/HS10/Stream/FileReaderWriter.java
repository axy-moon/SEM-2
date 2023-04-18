import java.io.*;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("textfile.txt");
        File outputFile = new File("secondfile.txt");

        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;

        while((c = in.read()) != -1) {
            System.out.print((char)c);
            out.write(c);
        }

        System.out.println("\nSuccessful");

        in.close();
        out.close();


    }
}