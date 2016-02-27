/**
 * Created by Michael on 2/27/16.
 */
public class Quack {
    /**
     * The quackCrypt method takes one parameter, a string of ASCII characters, and
     * converts each character into a variant of two quacks with different capitalization.
     * It returns the "quacked" text.
     *
     * @param str1 the string to be encrypted
     * @return quacked an encrypted string
     */

	public static String quackCrypt(String str1) {
		String quacked = "";
		char[] inputArray = str1.toCharArray();
		for (int i = 0; i < inputArray.length; i++) {
			switch (inputArray[i]) {
				case 0:	
					quacked += "quackquack";
					break;
				case 1:	
					quacked += "Quackquack";
					break;
				case 2:	
					quacked += "qUackquack";
					break;
				case 3:	
					quacked += "QUackquack";
					break;
				case 4:	
					quacked += "quAckquack";
					break;
				case 5:	
					quacked += "QuAckquack";
					break;
				case 6:	
					quacked += "qUAckquack";
					break;
				case 7:	
					quacked += "QUAckquack";
					break;
				case 8:	
					quacked += "quaCkquack";
					break;
				case 9:	
					quacked += "QuaCkquack";
					break;
				case 10:	
					quacked += "qUaCkquack";
					break;
				case 11:	
					quacked += "QUaCkquack";
					break;
				case 12:	
					quacked += "quACkquack";
					break;
				case 13:	
					quacked += "QuACkquack";
					break;
				case 14:	
					quacked += "qUACkquack";
					break;
				case 15:	
					quacked += "QUACkquack";
					break;
				case 16:	
					quacked += "quacKquack";
					break;
				case 17:	
					quacked += "QuacKquack";
					break;
				case 18:	
					quacked += "qUacKquack";
					break;
				case 19:	
					quacked += "QUacKquack";
					break;
				case 20:	
					quacked += "quAcKquack";
					break;
				case 21:	
					quacked += "QuAcKquack";
					break;
				case 22:	
					quacked += "qUAcKquack";
					break;
				case 23:	
					quacked += "QUAcKquack";
					break;
				case 24:	
					quacked += "quaCKquack";
					break;
				case 25:	
					quacked += "QuaCKquack";
					break;
				case 26:	
					quacked += "qUaCKquack";
					break;
				case 27:	
					quacked += "QUaCKquack";
					break;
				case 28:	
					quacked += "quACKquack";
					break;
				case 29:	
					quacked += "QuACKquack";
					break;
				case 30:	
					quacked += "qUACKquack";
					break;
				case 31:	
					quacked += "QUACKquack";
					break;
				case 32:	
					quacked += "quackQuack";
					break;
				case 33:	
					quacked += "QuackQuack";
					break;
				case 34:	
					quacked += "qUackQuack";
					break;
				case 35:	
					quacked += "QUackQuack";
					break;
				case 36:	
					quacked += "quAckQuack";
					break;
				case 37:	
					quacked += "QuAckQuack";
					break;
				case 38:	
					quacked += "qUAckQuack";
					break;
				case 39:	
					quacked += "QUAckQuack";
					break;
				case 40:	
					quacked += "quaCkQuack";
					break;
				case 41:	
					quacked += "QuaCkQuack";
					break;
				case 42:	
					quacked += "qUaCkQuack";
					break;
				case 43:	
					quacked += "QUaCkQuack";
					break;
				case 44:	
					quacked += "quACkQuack";
					break;
				case 45:	
					quacked += "QuACkQuack";
					break;
				case 46:	
					quacked += "qUACkQuack";
					break;
				case 47:	
					quacked += "QUACkQuack";
					break;
				case 48:	
					quacked += "quacKQuack";
					break;
				case 49:	
					quacked += "QuacKQuack";
					break;
				case 50:	
					quacked += "qUacKQuack";
					break;
				case 51:	
					quacked += "QUacKQuack";
					break;
				case 52:	
					quacked += "quAcKQuack";
					break;
				case 53:	
					quacked += "QuAcKQuack";
					break;
				case 54:	
					quacked += "qUAcKQuack";
					break;
				case 55:	
					quacked += "QUAcKQuack";
					break;
				case 56:	
					quacked += "quaCKQuack";
					break;
				case 57:	
					quacked += "QuaCKQuack";
					break;
				case 58:	
					quacked += "qUaCKQuack";
					break;
				case 59:	
					quacked += "QUaCKQuack";
					break;
				case 60:	
					quacked += "quACKQuack";
					break;
				case 61:	
					quacked += "QuACKQuack";
					break;
				case 62:	
					quacked += "qUACKQuack";
					break;
				case 63:	
					quacked += "QUACKQuack";
					break;
				case 64:	
					quacked += "quackqUack";
					break;
				case 65:	
					quacked += "QuackqUack";
					break;
				case 66:	
					quacked += "qUackqUack";
					break;
				case 67:	
					quacked += "QUackqUack";
					break;
				case 68:	
					quacked += "quAckqUack";
					break;
				case 69:	
					quacked += "QuAckqUack";
					break;
				case 70:	
					quacked += "qUAckqUack";
					break;
				case 71:	
					quacked += "QUAckqUack";
					break;
				case 72:	
					quacked += "quaCkqUack";
					break;
				case 73:	
					quacked += "QuaCkqUack";
					break;
				case 74:	
					quacked += "qUaCkqUack";
					break;
				case 75:	
					quacked += "QUaCkqUack";
					break;
				case 76:	
					quacked += "quACkqUack";
					break;
				case 77:	
					quacked += "QuACkqUack";
					break;
				case 78:	
					quacked += "qUACkqUack";
					break;
				case 79:	
					quacked += "QUACkqUack";
					break;
				case 80:	
					quacked += "quacKqUack";
					break;
				case 81:	
					quacked += "QuacKqUack";
					break;
				case 82:	
					quacked += "qUacKqUack";
					break;
				case 83:	
					quacked += "QUacKqUack";
					break;
				case 84:	
					quacked += "quAcKqUack";
					break;
				case 85:	
					quacked += "QuAcKqUack";
					break;
				case 86:	
					quacked += "qUAcKqUack";
					break;
				case 87:	
					quacked += "QUAcKqUack";
					break;
				case 88:	
					quacked += "quaCKqUack";
					break;
				case 89:	
					quacked += "QuaCKqUack";
					break;
				case 90:	
					quacked += "qUaCKqUack";
					break;
				case 91:	
					quacked += "QUaCKqUack";
					break;
				case 92:	
					quacked += "quACKqUack";
					break;
				case 93:	
					quacked += "QuACKqUack";
					break;
				case 94:	
					quacked += "qUACKqUack";
					break;
				case 95:	
					quacked += "QUACKqUack";
					break;
				case 96:	
					quacked += "quackQUack";
					break;
				case 97:	
					quacked += "QuackQUack";
					break;
				case 98:	
					quacked += "qUackQUack";
					break;
				case 99:	
					quacked += "QUackQUack";
					break;
				case 100:	
					quacked += "quAckQUack";
					break;
				case 101:	
					quacked += "QuAckQUack";
					break;
				case 102:	
					quacked += "qUAckQUack";
					break;
				case 103:	
					quacked += "QUAckQUack";
					break;
				case 104:	
					quacked += "quaCkQUack";
					break;
				case 105:	
					quacked += "QuaCkQUack";
					break;
				case 106:	
					quacked += "qUaCkQUack";
					break;
				case 107:	
					quacked += "QUaCkQUack";
					break;
				case 108:	
					quacked += "quACkQUack";
					break;
				case 109:	
					quacked += "QuACkQUack";
					break;
				case 110:	
					quacked += "qUACkQUack";
					break;
				case 111:	
					quacked += "QUACkQUack";
					break;
				case 112:	
					quacked += "quacKQUack";
					break;
				case 113:	
					quacked += "QuacKQUack";
					break;
				case 114:	
					quacked += "qUacKQUack";
					break;
				case 115:	
					quacked += "QUacKQUack";
					break;
				case 116:	
					quacked += "quAcKQUack";
					break;
				case 117:	
					quacked += "QuAcKQUack";
					break;
				case 118:	
					quacked += "qUAcKQUack";
					break;
				case 119:	
					quacked += "QUAcKQUack";
					break;
				case 120:	
					quacked += "quaCKQUack";
					break;
				case 121:	
					quacked += "QuaCKQUack";
					break;
				case 122:	
					quacked += "qUaCKQUack";
					break;
				case 123:	
					quacked += "QUaCKQUack";
					break;
				case 124:	
					quacked += "quACKQUack";
					break;
				case 125:	
					quacked += "QuACKQUack";
					break;
				case 126:	
					quacked += "qUACKQUack";
					break;
				case 127:	
					quacked += "QUACKQUack";
					break;
				case 128:	
					quacked += "quackquAck";
					break;
				case 129:	
					quacked += "QuackquAck";
					break;
				case 130:	
					quacked += "qUackquAck";
					break;
				case 131:	
					quacked += "QUackquAck";
					break;
				case 132:	
					quacked += "quAckquAck";
					break;
				case 133:	
					quacked += "QuAckquAck";
					break;
				case 134:	
					quacked += "qUAckquAck";
					break;
				case 135:	
					quacked += "QUAckquAck";
					break;
				case 136:	
					quacked += "quaCkquAck";
					break;
				case 137:	
					quacked += "QuaCkquAck";
					break;
				case 138:	
					quacked += "qUaCkquAck";
					break;
				case 139:	
					quacked += "QUaCkquAck";
					break;
				case 140:	
					quacked += "quACkquAck";
					break;
				case 141:	
					quacked += "QuACkquAck";
					break;
				case 142:	
					quacked += "qUACkquAck";
					break;
				case 143:	
					quacked += "QUACkquAck";
					break;
			}
			quacked += " ";
		}
		return quacked;
	}

    /**
     * The quackReader method takes one parameter, a quack encrypted string, and
     * converts each series of two quacks with the corresponding character. It returns
     * the translated text.
     *
     * @param str2 the string to be decrypted
     * @return deQuacked the decrypted string
     */

    public static String quackReader(String str2) {
        String deQuacked = "";
        String[] translateArray = str2.split(" ");
        for (int j = 0; j < translateArray.length; j++) {
            switch (translateArray[j]) {
                case "QUacKQuaCK":
                    deQuacked = deQuacked + '\n';
                    break;
                case "qUACKQUAcK":
                    deQuacked = deQuacked + '+';
                    break;
                case "quACkqUAck":
                    deQuacked = deQuacked + '.';
                    break;
                case "quackquack":
                    deQuacked = deQuacked + '/';
                    break;
                case "Quackquack":
                    deQuacked = deQuacked + '0';
                    break;
                case "qUackquack":
                    deQuacked = deQuacked + '1';
                    break;
                case "quAckquack":
                    deQuacked = deQuacked + '2';
                    break;
                case "quaCkquack":
                    deQuacked = deQuacked + '3';
                    break;
                case "quacKquack":
                    deQuacked = deQuacked + '4';
                    break;
                case "quackQuack":
                    deQuacked = deQuacked + '5';
                    break;
                case "quackqUack":
                    deQuacked = deQuacked + '6';
                    break;
                case "quackquAck":
                    deQuacked = deQuacked + '7';
                    break;
                case "quackquaCk":
                    deQuacked = deQuacked + '8';
                    break;
                case "quackquacK":
                    deQuacked = deQuacked + '9';
                    break;
                case "QUackquack":
                    deQuacked = deQuacked + '=';
                    break;
                case "QuAckquack":
                    deQuacked = deQuacked + 'A';
                    break;
                case "QuaCkquack":
                    deQuacked = deQuacked + 'B';
                    break;
                case "QuacKquack":
                    deQuacked = deQuacked + 'C';
                    break;
                case "QuackQuack":
                    deQuacked = deQuacked + 'D';
                    break;
                case "QuackqUack":
                    deQuacked = deQuacked + 'E';
                    break;
                case "QuackquAck":
                    deQuacked = deQuacked + 'F';
                    break;
                case "QuackquaCk":
                    deQuacked = deQuacked + 'G';
                    break;
                case "QuackquacK":
                    deQuacked = deQuacked + 'H';
                    break;
                case "QUAckquack":
                    deQuacked = deQuacked + 'I';
                    break;
                case "QUaCkquack":
                    deQuacked = deQuacked + 'J';
                    break;
                case "QUacKquack":
                    deQuacked = deQuacked + 'K';
                    break;
                case "QUackQuack":
                    deQuacked = deQuacked + 'L';
                    break;
                case "QUackqUack":
                    deQuacked = deQuacked + 'M';
                    break;
                case "QUackquAck":
                    deQuacked = deQuacked + 'N';
                    break;
                case "QUackquaCk":
                    deQuacked = deQuacked + 'O';
                    break;
                case "QUackquacK":
                    deQuacked = deQuacked + 'P';
                    break;
                case "QUACkquack":
                    deQuacked = deQuacked + 'Q';
                    break;
                case "QUAcKquack":
                    deQuacked = deQuacked + 'R';
                    break;
                case "QUAckQuack":
                    deQuacked = deQuacked + 'S';
                    break;
                case "QUAckqUack":
                    deQuacked = deQuacked + 'T';
                    break;
                case "QUAckquAck":
                    deQuacked = deQuacked + 'U';
                    break;
                case "QUAckquaCk":
                    deQuacked = deQuacked + 'V';
                    break;
                case "QUAckquacK":
                    deQuacked = deQuacked + 'W';
                    break;
                case "QUACKquack":
                    deQuacked = deQuacked + 'X';
                    break;
                case "QUACkQuack":
                    deQuacked = deQuacked + 'Y';
                    break;
                case "QUACkqUack":
                    deQuacked = deQuacked + 'Z';
                    break;
                case "QUACkquAck":
                    deQuacked = deQuacked + 'a';
                    break;
                case "QUACkquaCk":
                    deQuacked = deQuacked + 'b';
                    break;
                case "QUACkquacK":
                    deQuacked = deQuacked + 'c';
                    break;
                case "QUACKQuack":
                    deQuacked = deQuacked + 'd';
                    break;
                case "QUACKqUack":
                    deQuacked = deQuacked + 'e';
                    break;
                case "QUACKquAck":
                    deQuacked = deQuacked + 'f';
                    break;
                case "QUACKquaCk":
                    deQuacked = deQuacked + 'g';
                    break;
                case "QUACKquacK":
                    deQuacked = deQuacked + 'h';
                    break;
                case "QUACKQUack":
                    deQuacked = deQuacked + 'i';
                    break;
                case "QUACKQuAck":
                    deQuacked = deQuacked + 'j';
                    break;
                case "QUACKQuaCk":
                    deQuacked = deQuacked + 'k';
                    break;
                case "QUACKQuacK":
                    deQuacked = deQuacked + 'l';
                    break;
                case "QUACKQUAck":
                    deQuacked = deQuacked + 'm';
                    break;
                case "QUACKQUaCk":
                    deQuacked = deQuacked + 'n';
                    break;
                case "QUACKQUacK":
                    deQuacked = deQuacked + 'o';
                    break;
                case "QUACKQUACk":
                    deQuacked = deQuacked + 'p';
                    break;
                case "QUACKQUAcK":
                    deQuacked = deQuacked + 'q';
                    break;
                case "QUACKQUACK":
                    deQuacked = deQuacked + 'r';
                    break;
                case "qUACKQUACK":
                    deQuacked = deQuacked + 's';
                    break;
                case "QuACKQUACK":
                    deQuacked = deQuacked + 't';
                    break;
                case "QUaCKQUACK":
                    deQuacked = deQuacked + 'u';
                    break;
                case "QUAcKQUACK":
                    deQuacked = deQuacked + 'v';
                    break;
                case "QUACkQUACK":
                    deQuacked = deQuacked + 'w';
                    break;
                case "QUACKqUACK":
                    deQuacked = deQuacked + 'x';
                    break;
                case "QUACKQuACK":
                    deQuacked = deQuacked + 'y';
                    break;
                case "QUACKQUaCK":
                    deQuacked = deQuacked + 'z';
                    break;

            }
        }
        return deQuacked;

    }
}
