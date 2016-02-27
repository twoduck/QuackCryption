import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.*;
import java.io.*;
import java.util.Scanner;

public class QuackCryptor{

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java quackcryption [encrypt, decrypt] [file.txt]");
            return;
        }
        Scanner scan;
        PrintWriter writer;
        String command = args[0];
        String file = args[1];

        String temp;
        String temp2;
        if (command.equalsIgnoreCase("encrypt")) {
            try {
                //System.out.println("File: " + file);
                scan = new Scanner(new File(file));
                writer = new PrintWriter("quacked.quack", "UTF-8");
                String header = makeHeader(file);
                writer.print(header);
                while (scan.hasNext()) {
                    temp2 = scan.next();
                    //System.out.println("Line: " + temp2);
                    temp = encrypt("QuackQuackQuack!", "RandomInitVector", temp2);
                    temp2 = quackCryptor(temp);
                    //System.out.println("Quack: " + temp2);
                    writer.println(temp2);
                }
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (command.equalsIgnoreCase("decrypt")) {
            try {
                //System.out.println("File: " + file);
                scan = new Scanner(new File(file));
                if (!(scan.next().equals("QuAcKqUaCk"))) {
                    System.out.println("Inputted file is not encrypted with QuackCryption");
                    return;
                }
                String header = "";
                for (int x = 0; x < 255; x++) {
                    header += scan.next();
                    if (x != 254)
                        header += " ";
                }
                String name = decryptHeader(header);
                System.out.println("name is: " + name);
                writer = new PrintWriter(name, "UTF-8");
                while (scan.hasNext()) {
                    temp = scan.nextLine();
                    System.out.println("Line: " + temp);
                    temp2 = quackReader(temp);
                    temp = decrypt("QuackQuackQuack!", "RandomInitVector", temp2);
                    writer.write(temp);
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Usage: java quackcryption [encrypt, decrypt] [file.txt]");
            return;
        }
    }

    
}