package impl;

import interfaces.BaseArrayString;
import interfaces.Decorator;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;

/**
 * Created by GEO on 15.10.15.
 */
public class BaseArray64Encrypt extends Decorator {

    public BaseArray64Encrypt(BaseArrayString baseStr) {
        super(baseStr);
    }


    @Override
    public String getOriginalString() {

        String string=super.getOriginalString();
        String encString;
        try{
            byte[] utf8=string.getBytes("UTF8");
            encString= DatatypeConverter.printBase64Binary(utf8); // SXRgcyBteSBvcmlnaW5hbCBzdHJpbmch
            return encString;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return super.getOriginalString();
    }


    public void returnNameEncryp(){
        System.out.println("#BASE64 encoder");
    }
}