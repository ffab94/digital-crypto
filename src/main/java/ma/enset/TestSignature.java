package ma.enset;

public class TestSignature {
    public static void main(String[] args) throws Exception{
        CryptoUtilImpl cryptoUtil=new CryptoUtilImpl();
        String secret="azerty";
        String document="This is my message";
        String signature = cryptoUtil.hmacSign(document.getBytes(), secret);

        String signedDocument=document+"_.._"+signature;
        System.out.println(signedDocument);

        System.out.println("Signature verification");

        boolean signatureVerifTest = cryptoUtil.hmacVerify(signedDocument, "azerty");
        System.out.println(signatureVerifTest==true?"Signature OK":"Signature not OK");
    }
}
