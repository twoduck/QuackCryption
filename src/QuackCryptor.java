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
                String toEncrypt = "";
                for (int x = 0; x < bytes; x++) {
                    System.out.println(b = fis.read());
                    toEncrypt += b;
                    /*temp = AES.encrypt("QuackQuackQuack!", "RandomInitVector", ((char) b) + "");
                    System.out.println(temp);
                    temp2 = Quack.quackCrypt(temp);
                    writer.print(temp2);*/
                }
                temp = AES.encrypt("QuackQuackQuack!", "RandomInitVector", toEncrypt);
                temp2 = Quack.quackCrypt(temp);
                writer.print(temp2);
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
                scan = new Scanner(file);
                if (!(scan.next().equals("qUACkquaCk"))) {
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
                String quacks = "";
                while (scan.hasNext()) {
                    quacks += scan.next() + " ";
                }
                String toUnAES = Quack.quackReader(quacks);
                String unAESd = AES.decrypt("QuackQuackQuack!", "RandomInitVector", toUnAES);
                System.out.println(unAESd);


                /*
                String aes = Quack.quackReader(quacks);
                String endString = "";
                for (int x = 0; x < 1000; x++) {

                    aes = AES.decrypt("QuackQuackQuack!", "RandomInitVector", aes);
                }
                */
                File output = new File("icon.jpg");
                FileOutputStream fos = new FileOutputStream(output);
                /*System.out.println(aes);
                for (int i = 0; i < aes.length(); i++) {
                    System.out.println("50");
                    fos.write(aes.charAt(i));
                }
                fos.close();
                return;
                */
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Usage: java quackcryption [encrypt, decrypt] [file.txt]");
            return;
        }
    }
}