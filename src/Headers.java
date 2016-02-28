/**
 * Created by Michael on 2/27/16.
 */
public class Headers {

    public static String makeHeader(String fileName) {
        String header = "qUACkquaCk ";
        header += Quack.quackCrypt(fileName);
        //System.out.println(header);
        String[] headers = header.split(" ");
        for (int x = headers.length; x < 256; x++) {
            header += "qUaCkQuAcK ";
        }
        return header;
    }

    public static String decryptHeader (String header) {
        String[] quacks = header.split(" ");
        String tempQuacks = "";
        String name;
        for (int x = 0; x < quacks.length; x++) {
            tempQuacks += quacks[x];
            if (x != quacks.length - 1)
                tempQuacks += " ";
        }
        name = Quack.quackReader(tempQuacks);
        return name;
    }
}
