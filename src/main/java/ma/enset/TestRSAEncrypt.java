package ma.enset;

import javax.crypto.Cipher;
import java.security.*;
import java.util.Base64;

public class TestRSAEncrypt {
    public static void main(String[] args) throws Exception{

        /*
        Private Key:
        MIIBVQIBADANBgkqhkiG9w0BAQEFAASCAT8wggE7AgEAAkEAp6TUo3Z3lsQz4pyVKIg8x1jcAgnl0pSXJ3EAesT/fIytJ0syb+FmU+X8Yw62ESDKyGBaz3f0+69H+RX1wlARlwIDAQABAkAbfvh1Ww/gRYvxBhecz0OQuq1TFEaClGZ6TJl0iW0SA0hTIv9Dh/HqHiS1mF0KHH1K8TN6oG3Vuv/alzLsulnZAiEA6N0tD4wBgIM/stoXDF/BZfnD2858PKjlZCdt896xBV0CIQC4TM0gwgbfyb3SXXo1PorTKTI9/WOkjVtGEge2WJNvgwIgaJAIT9baRc6pp7Hub4v/176Th/vsJYDhoFtkMAFrE7ECIQCbGIbHuoDuc2g7UE8335oUeea+JC9mm07keOfknEX24QIhAM1PvMX2cvBN3X/rqe5Vyj1kLyEZThK861osCWo0lH/4
        Public Key:
        MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKek1KN2d5bEM+KclSiIPMdY3AIJ5dKUlydxAHrE/3yMrSdLMm/hZlPl/GMOthEgyshgWs939PuvR/kV9cJQEZcCAwEAAQ==

        */
        CryptoUtilImpl cryptoUtil=new CryptoUtilImpl();
        String publicKeyBase64="MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKek1KN2d5bEM+KclSiIPMdY3AIJ5dKUlydxAHrE/3yMrSdLMm/hZlPl/GMOthEgyshgWs939PuvR/kV9cJQEZcCAwEAAQ==";

        PublicKey publicKey=cryptoUtil.publicKeyFromBase64(publicKeyBase64);

        String data="Voici mon message en clair à chiffrer";
        String encryptedData=cryptoUtil.encryptRSA(data.getBytes(), publicKey);

        System.out.println("Encrypted message");
        System.out.println(encryptedData);

    }
}
