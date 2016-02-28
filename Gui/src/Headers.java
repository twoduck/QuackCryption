public class Headers {
    public static SingleStep ss = new SingleStep();

    public static String makeHeader(String fileName) {
        String header = "qUACkquaCk ";
        header += ss.toQuack(fileName);
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
        name = ss.fromQuack(tempQuacks);
        return name;
    }
}
