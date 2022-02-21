package ma.enset;

import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class TestRSADecrypt {
    public static void main(String[] args) throws Exception{
        /*
        Private Key:
        MIIBVQIBADANBgkqhkiG9w0BAQEFAASCAT8wggE7AgEAAkEAp6TUo3Z3lsQz4pyVKIg8x1jcAgnl0pSXJ3EAesT/fIytJ0syb+FmU+X8Yw62ESDKyGBaz3f0+69H+RX1wlARlwIDAQABAkAbfvh1Ww/gRYvxBhecz0OQuq1TFEaClGZ6TJl0iW0SA0hTIv9Dh/HqHiS1mF0KHH1K8TN6oG3Vuv/alzLsulnZAiEA6N0tD4wBgIM/stoXDF/BZfnD2858PKjlZCdt896xBV0CIQC4TM0gwgbfyb3SXXo1PorTKTI9/WOkjVtGEge2WJNvgwIgaJAIT9baRc6pp7Hub4v/176Th/vsJYDhoFtkMAFrE7ECIQCbGIbHuoDuc2g7UE8335oUeea+JC9mm07keOfknEX24QIhAM1PvMX2cvBN3X/rqe5Vyj1kLyEZThK861osCWo0lH/4
        Public Key:
        MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKek1KN2d5bEM+KclSiIPMdY3AIJ5dKUlydxAHrE/3yMrSdLMm/hZlPl/GMOthEgyshgWs939PuvR/kV9cJQEZcCAwEAAQ==

        */

        CryptoUtilImpl cryptoUtil=new CryptoUtilImpl();

        String privateKeyBase64="MIIBVQIBADANBgkqhkiG9w0BAQEFAASCAT8wggE7AgEAAkEAp6TUo3Z3lsQz4pyVKIg8x1jcAgnl0pSXJ3EAesT/fIytJ0syb+FmU+X8Yw62ESDKyGBaz3f0+69H+RX1wlARlwIDAQABAkAbfvh1Ww/gRYvxBhecz0OQuq1TFEaClGZ6TJl0iW0SA0hTIv9Dh/HqHiS1mF0KHH1K8TN6oG3Vuv/alzLsulnZAiEA6N0tD4wBgIM/stoXDF/BZfnD2858PKjlZCdt896xBV0CIQC4TM0gwgbfyb3SXXo1PorTKTI9/WOkjVtGEge2WJNvgwIgaJAIT9baRc6pp7Hub4v/176Th/vsJYDhoFtkMAFrE7ECIQCbGIbHuoDuc2g7UE8335oUeea+JC9mm07keOfknEX24QIhAM1PvMX2cvBN3X/rqe5Vyj1kLyEZThK861osCWo0lH/4";

        PrivateKey privateKey=cryptoUtil.privateKeyFromBase64(privateKeyBase64);

        String encryptedData="Lewh3rhmyJ4ccTmJbxFzS5nPi9G5HMLfqBIUgmZ78wuulbvf7Z5KFEpifneVj9urnpEdGM3QMj8YF7WH5xGKsA==";
        System.out.println("Encrypted message");
        System.out.println(encryptedData);


        byte[] decryptedBytes = cryptoUtil.decryptRSA(encryptedData, privateKey);

        System.out.println("Decrypted message");
        System.out.println(new String(decryptedBytes));

    }
}
