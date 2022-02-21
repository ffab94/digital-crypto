package ma.enset;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class SymetricDecryptAESTest {
    public static void main(String[] args) throws Exception {
        String receivedEncryptedData="aTdsQ2ijTgJydJRWZIZPekqxuF32Pzaaatbwq9cGh9c=";

        CryptoUtilImpl cryptoUtil=new CryptoUtilImpl();
        //SecretKey secretKey=cryptoUtil.generateSecretKey();
        SecretKey secretKey=cryptoUtil.generateSecretKey("azerty_azerty_az");
        //String mySecret="azerty_azerty_az";

        byte[] bytes = cryptoUtil.decryptedAES(receivedEncryptedData, secretKey);
        System.out.println(new String(bytes));
    }
}
