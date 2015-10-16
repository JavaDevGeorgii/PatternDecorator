import impl.Base64Encrypt;
import impl.OriginalString;
import interfaces.Decorator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        //String firstStr="It`s my original string!";

//        BaseString baseString=new OriginalString(firstStr);
//
//        Decorator xorInputStr=new XOREncrypt(originalString);
//        System.out.println(xorInputStr.getOriginalString());
//
//        Decorator base64InputStr=new Base64Encrypt(new OriginalString (null,firstStr));
//        System.out.println(base64InputStr.getString());


        String firstStr="It`s my original string!";

        final String FILE_PATH="/Users/GEO/Documents/JavaExec/PatternDecorator/src/sources";
        BufferedReader br;
        Decorator base64InputStr = null;

        try {
            br=new BufferedReader(new FileReader(FILE_PATH+"/public"));
            String s;
            while ((s=br.readLine())!=null){
                System.out.println(s);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            base64InputStr=new Base64Encrypt(new OriginalString(new FileReader(FILE_PATH+"/public")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(base64InputStr.getOriginalString());
    }
}
