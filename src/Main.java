import impl.*;
import interfaces.Decorator;

public class Main {

    //final static String FILE_PATH="/Users/dg/java/PatternDecorator/src/sources/";

    final static String FILE_PATH_TO_READ="/Users/GEO/Documents/JavaExec/PatternDecorator/PatternDecorator/src/sources/public";

    final static String FILE_PATH_TO_WRITE="/Users/GEO/Documents/JavaExec/PatternDecorator/PatternDecorator/src/sources/public_Encoded_B64";
    final static String FILE_PATH_TO_DECODE="/Users/GEO/Documents/JavaExec/PatternDecorator/PatternDecorator/src/sources/public_Decoded_B64";

    final static String FILE_PATH_TO_XORENCODE="/Users/GEO/Documents/JavaExec/PatternDecorator/PatternDecorator/src/sources/public_Encoded_XOR";
    final static String FILE_PATH_TO_XORDECODE="/Users/GEO/Documents/JavaExec/PatternDecorator/PatternDecorator/src/sources/public_Decoded_XOR";

    public static void main(String[] args) {

        Decorator base64encode=new BaseArray64Encrypt(new OriginalArray());
        base64encode.writeTo(base64encode.readFrom(FILE_PATH_TO_READ), FILE_PATH_TO_WRITE);

        Decorator base64Decode=new BaseArray64Decrypt(new OriginalArray());
        base64Decode.writeTo(base64Decode.readFrom(FILE_PATH_TO_WRITE),FILE_PATH_TO_DECODE);


        String key = "12345678906636455476325427364526745987654321";
        Decorator xorEncode=new XOREncrypt(new OriginalArray());
        xorEncode.writeTo(xorEncode.readFrom(FILE_PATH_TO_READ), FILE_PATH_TO_XORENCODE, key);

        Decorator xorDecode=new XORDecrypt(new OriginalArray());
        xorDecode.writeTo(xorDecode.readFrom(FILE_PATH_TO_XORENCODE),FILE_PATH_TO_XORDECODE, key);



    }

}
