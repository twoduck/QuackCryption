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
        String command = args[0]; //used to specify the user's intent
        String fileName = args[1];
        String temp, temp2;

        if (command.equalsIgnoreCase("encrypt")) {
            try {
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
                temp = AES.encrypt("QuackQuackQuack!", "RandomInitVector", toEncrypt); //encrypts the string of bytes
                temp2 = Quack.quackCrypt(temp); //encrypts the encrypted string into quacks
                writer.print(temp2); //prints quacks to the file, following the header
                fis.close();
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (command.equalsIgnoreCase("decrypt")) {
            try {
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
                String toUnAES = Quack.quackReader(quacks);//converts quacks to encrypted text
                String unAESd = AES.decrypt("QuackQuackQuack!", "RandomInitVector", toUnAES);//decrypts encrypted text
                //System.out.println(unAESd);
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
        } else {
            System.out.println("Usage: java quackcryption [encrypt, decrypt] [file.txt]"); //if neither encrypt or decrpyt were selected, return
            return;
        }
    }
}