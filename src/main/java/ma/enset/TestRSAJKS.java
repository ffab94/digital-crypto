package ma.enset;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class TestRSAJKS {
    public static void main(String[] args) throws Exception{
        CryptoUtilImpl cryptoUtil=new CryptoUtilImpl();
        PublicKey publicKey=cryptoUtil.publicKeyFromCertificate("publicke.cert");
        PrivateKey privateKey=cryptoUtil.privateKeyFromJKS("youssfi.jks","123456","youssfi");
        System.out.println(cryptoUtil.encodeToBase64(publicKey.getEncoded()));
        System.out.println(cryptoUtil.encodeToBase64(privateKey.getEncoded()));

        String data="My secret message";
        String encrypted = cryptoUtil.encryptRSA(data.getBytes(), publicKey);
        System.out.println("Encrypted:");
        System.out.println(encrypted);
        byte[] decryptedBytes = cryptoUtil.decryptRSA(encrypted, privateKey);
        System.out.println("Decrypted:");
        System.out.println(new String(decryptedBytes));

    }
}
