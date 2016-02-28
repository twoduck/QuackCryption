import java.io.*;
import java.util.Scanner;

public class QuackCryptor {
    public static void main(String[] args) {
        SingleStep ss = new SingleStep();
        if (args.length != 2) {
            System.out.println("Usage: java quackcryption [encrypt, decrypt] [file.txt]");
            return;
        }
        Scanner scan;
        PrintWriter writer;
        String command = args[0]; //used to specify the user's intent
        String fileName = args[1];

        if (command.equalsIgnoreCase("encrypt")) {
            encrypt(fileName, "QuackQuackQuack!", "RandomInitVector");
        } else if (command.equalsIgnoreCase("decrypt")) {
            decrypt(fileName, "QuackQuackQuack!", "RandomInitVector");
        } else {
            System.out.println("Usage: java quackcryption [encrypt, decrypt] [file.txt]"); //if neither encrypt or decrpyt were selected, return
            return;
        }
    }

    public static void encrypt(String fileName, String key, String initVector) {
        try {
            SingleStep ss = new SingleStep();
            System.out.println("Encrypting...");
            Scanner scan;
            PrintWriter writer;
            String temp, temp2;
            System.out.println("File: " + fileName);
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file);
            int bytes = fis.available(); //sees how many bytes are available in the file
            writer = new PrintWriter("encrypted.quack", "UTF-8");
            String header = Headers.makeHeader(fileName); //Creates the header, which stores data about file name/extension
            writer.print(header); //Prints header to the start of the file

            int b;
            String toEncrypt = "";
            for (int x = 0; x < bytes; x++) {
                b = fis.read(); //reads the next byte in the file
                toEncrypt += b + " "; //puts the next byte in the file followed by a space
            }
            temp = ss.toAES(key, initVector, toEncrypt); //encrypts the string of bytes
            temp2 = ss.toQuack(temp); //encrypts the encrypted string into quacks
            writer.print(temp2); //prints quacks to the file, following the header
            fis.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void decrypt(String fileName, String key, String initVector) {
        try {
            SingleStep ss = new SingleStep();
            System.out.println("Decrypting...");
            Scanner scan;
            PrintWriter writer;
            String temp, temp2;
            System.out.println("File: " + fileName);
            File file = new File(fileName);
            scan = new Scanner(file);
            if (!(scan.next().equals("qUACkquaCk"))) {
                System.out.println("Inputted file is not encrypted with QuackCryption"); //returns if the encryption identifier is not at the start of the file
                return;
            }
            String header = "";//creates a string to contain the header
            for (int x = 0; x < 255; x++) {
                header += scan.next();//add each quack to the header string
                if (x != 254)
                    header += " ";//only add a space if not at the end
            }
            String name = Headers.decryptHeader(header);//decrypt header to filename.extension
            String quacks = "";//string used to store quacks
            while (scan.hasNext()) {
                quacks += scan.next() + " "; //contains all quacks in the file
            }
            String toUnAES = ss.fromQuack(quacks);//converts quacks to encrypted text
            String unAESd = ss.fromAES("QuackQuackQuack!", "RandomInitVector", toUnAES);//decrypts encrypted text
            String[] test = unAESd.split(" ");

            File output = new File(name);//writes to a file with the name and extension found in the header
            FileOutputStream fos = new FileOutputStream(output);
            for (int i = 0; i < test.length; i++) {
                fos.write(Integer.parseInt(test[i]));//writes each character to the file
            }
            fos.close();
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}