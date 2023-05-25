import java.util.PriorityQueue;
import java.util.Scanner;

class HuffmanNode implements Comparable<HuffmanNode> {
    int frequency;
    char data;
    HuffmanNode left, right;

    public HuffmanNode(char data, int frequency) {
        this.data = data;
        this.frequency = frequency;
        left = right = null;
    }

    public int compareTo(HuffmanNode node) {
        return frequency - node.frequency;
    }
}

class HuffmanCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        int[] frequencies = new int[256];
        for (int i = 0; i < inputString.length(); i++) {
            frequencies[inputString.charAt(i)]++;
        }

        PriorityQueue<HuffmanNode> queue = new PriorityQueue<>();
        for (char i = 0; i < 256; i++) {
            if (frequencies[i] > 0) {
                queue.add(new HuffmanNode(i, frequencies[i]));
            }
        }

        while (queue.size() > 1) {
            HuffmanNode left = queue.poll();
            HuffmanNode right = queue.poll();
            HuffmanNode parent = new HuffmanNode('\0', left.frequency + right.frequency);
            parent.left = left;
            parent.right = right;
            queue.add(parent);
        }

        HuffmanNode root = queue.peek();
        String[] codes = new String[256];
        generateCodes(root, "", codes);

        System.out.println("Huffman Codes:");
        for (int i = 0; i < 256; i++) {
            if (codes[i] != null) {
                System.out.println((char) i + " : " + codes[i]);
            }
        }

        String encodedString = encodeString(inputString, codes);
        System.out.println("Encoded String: " + encodedString);

        String decodedString = decodeString(encodedString, root);
        System.out.println("Decoded String: " + decodedString);
    }

    public static void generateCodes(HuffmanNode root, String code, String[] codes) {
        if (root == null) {
            return;
        }
        if (root.data != '\0') {
            codes[root.data] = code;
        }
        generateCodes(root.left, code + "0", codes);
        generateCodes(root.right, code + "1", codes);
    }

    public static String encodeString(String inputString, String[] codes) {
        String encodedString = "";
        for (int i = 0; i < inputString.length(); i++) {
            encodedString += codes[inputString.charAt(i)];
        }
        return encodedString;
    }

    public static String decodeString(String encodedString, HuffmanNode root) {
        String decodedString = "";
        HuffmanNode current = root;
        for (int i = 0; i < encodedString.length(); i++) {
            if (encodedString.charAt(i) == '0') {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current.data != '\0') {
                decodedString += current.data;
                current = root;
            }
        }
        return decodedString;
    }
}