import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.*;

public class AES { // This class encrypts all files using AES (128-bit CBC with PKCS5 Padding).
    public static String encrypt(String key, String initVector, String value) { // 'key' and 'initVector' must be 16 characters long
        try {																	// 'value' can be of any length.
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("ASCII"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("ASCII"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

            byte[] encrypted = cipher.doFinal(value.getBytes());

            return Base64.encodeBase64String(encrypted);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public static String decrypt(String key, String initVector, String encrypted) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("ASCII"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("ASCII"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

            byte[] original = cipher.doFinal(Base64.decodeBase64(encrypted));
			
            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

}
