package ma.enset;

import java.util.Arrays;
import java.util.Base64;

public class EncoderDecoderTest {
    public static void main(String[] args) {
        String document="This is my message>>>";

        byte[] bytes = document.getBytes();
        System.out.println(Arrays.toString(bytes));

        String documentBase64 = Base64.getEncoder().encodeToString(bytes);
        System.out.println(documentBase64);

        byte[] decoded = Base64.getDecoder().decode(documentBase64);
        System.out.println(new String(decoded));

        String documentBase64Url = Base64.getUrlEncoder().encodeToString(bytes);
        System.out.println(documentBase64Url);

        CryptoUtilImpl cryptoUtil=new CryptoUtilImpl();
        String data="Hello from ENSET";
        
        String dataBase64=cryptoUtil.encodeToBase64(data.getBytes());
        String dataBase64Url=cryptoUtil.encodeToBase64URL(data.getBytes());
        System.out.println(dataBase64);
        System.out.println(dataBase64Url);

        byte[] decodedBytes = cryptoUtil.decodeFromBase64(dataBase64);
        System.out.println(new String(decodedBytes));
        byte[] decodedBytes2 = cryptoUtil.DecodeFromBase64URL(dataBase64Url);
        System.out.println(new String(decodedBytes2));

        String s = cryptoUtil.encodeToHex(data.getBytes());
        String s1 = cryptoUtil.encodeToHexApacheCedec(data.getBytes());
        String s2 = cryptoUtil.encodeToHexNative(data.getBytes());
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);


    }
}
