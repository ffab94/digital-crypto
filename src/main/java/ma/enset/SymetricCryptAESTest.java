package ma.enset;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class SymetricCryptAESTest {
    public static void main(String[] args) throws Exception{
        CryptoUtilImpl cryptoUtil=new CryptoUtilImpl();
        //SecretKey secretKey=cryptoUtil.generateSecretKey();
        SecretKey secretKey=cryptoUtil.generateSecretKey("azerty_azerty_az");
        byte[] secretKeyBytes=secretKey.getEncoded();
        System.out.println(Arrays.toString(secretKeyBytes));
        String encodedSecretKey = Base64.getEncoder().encodeToString(secretKeyBytes);
        System.out.println(encodedSecretKey);
        System.out.println("====================================");

        String data="This is my message";

        //String secret="azerty_azerty_az";



        String encryptedData = cryptoUtil.encryptAES(data.getBytes(), secretKey);
        System.out.println(encryptedData);
        byte[] decryptedData=cryptoUtil.decryptedAES(encryptedData,secretKey);
        System.out.println(new String(decryptedData));



    }
}
