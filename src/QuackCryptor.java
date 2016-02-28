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
        String fileName = args[1];
        String temp;
        String temp2;

        if (command.equalsIgnoreCase("encrypt")) {
            try {
                System.out.println("File: " + fileName);
                File file = new File(fileName);
                //scan = new Scanner(file);
                FileInputStream fis = new FileInputStream(file);
                int bytes = fis.available();
                writer = new PrintWriter("quacked.quack", "UTF-8");
                String header = Headers.makeHeader(fileName);
                writer.print(header);
                int b;
                for (int x = 0; x < bytes; x++) {
                    System.out.println(b = fis.read());
                    temp = AES.encrypt("QuackQuackQuack!", "RandomInitVector", ((char) b) + "");
                    temp2 = Quack.quackCrypt(temp);
                    writer.print(temp2);
                }
                fis.close();
                /*while(scan.hasNextByte()) {
                    System.out.println("Found a byte!");
                    temp = AES.encrypt("QuackQuackQuack!", "RandomInitVector", ((char) scan.nextByte()) + ""); //converts current byte to AES
                    temp2 = Quack.quackCrypt(temp);
                    writer.print(temp2);
                }*/
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (command.equalsIgnoreCase("decrypt")) {
            try {
                System.out.println("File: " + fileName);
                File file = new File(fileName);
                //scan = new Scanner(file);
                scan = new Scanner(new File(fileName));
                if (!(scan.next().equals("quackquAck"))) {
                    System.out.println("Inputted file is not encrypted with QuackCryption");
                    return;
                }
                String header = "";
                for (int x = 0; x < 255; x++) {
                    header += scan.next();
                    if (x != 254)
                        header += " ";
                }
                String name = Headers.decryptHeader(header);
                System.out.println("name is: " + name);
                writer = new PrintWriter(name, "UTF-8");
                String QuackText = "";
                String AESText = "";
                temp = AES.decrypt("QuackQuackQuack!", "RandomInitVector", AESText);
                writer.printf(temp);
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