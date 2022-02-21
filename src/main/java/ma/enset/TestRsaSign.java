package ma.enset;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class TestRsaSign {
    public static void main(String[] args) throws Exception {
        CryptoUtilImpl cryptoUtil=new CryptoUtilImpl();
        PrivateKey privateKey=cryptoUtil.privateKeyFromJKS("youssfi.jks","123456","youssfi");
        String data="This is my mesdsage";
        String signature = cryptoUtil.rsaSign(data.getBytes(), privateKey);
        String signedDoc=data+"_.._"+signature;
        System.out.println(signedDoc);

        String signedDocReceived="This is my mesdsage_.._nu1P1+DsmZcMemydz0ke5E1ijSCaNHy4pfd4WqOwLhZUf36yJRMFxzFRU6bdEEu1FwZPSFNDMG8URACCfm/lXHi+t3tXe+Rj+M7S3+FT3DBi8JcS5/aQjRUR1TwnUXGb3QNN4WdzzJ8lqMusMlu+e3GVEm8m1oY2W5ArdSkUIAJOMnz+5zG14ZesE/snC775B6LBQh+0+wbTFwNcblNuMCfbxwdOWhxCWMGlwzgqGhgG2co/+4p7xSRxiRNMsartoUy1CoF+JCZp8j045/azrsTslhqCKuK9zWlSGB8MB9Lq6KeGgB9wGZaM+mVxNZ/9GxQ00UWtElDSMVBgf0giQQ==";
        PublicKey publicKey=cryptoUtil.publicKeyFromCertificate("publicke.cert");
        boolean signatureVerifTest = cryptoUtil.rsaSignVerify(signedDocReceived,publicKey);
        System.out.println(signatureVerifTest==true?"Signature OK":"Signature not OK");
    }
}
