package impl;

import interfaces.BaseArrayString;
import interfaces.Decorator;
import sun.misc.BASE64Decoder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by GEO on 15.10.15.
 */
public class BaseArray64Decrypt extends Decorator {

    BASE64Decoder base64Decoder;

    public BaseArray64Decrypt(BaseArrayString base) {
        super(base);
    }

    //read encoding string to array
    @Override
    public List<String> readFrom(String pathFileFrom) {
        return super.readFrom(pathFileFrom);
    }

    //write decoding string to file
    @Override
    public void writeTo(List<String> strArr, String pathFileTo) {

        base64Decoder=new BASE64Decoder();
        BufferedWriter bw=null;
        try {
            bw = new BufferedWriter(new FileWriter(pathFileTo));
            for (String s : strArr) {
                byte[] decoded = base64Decoder.decodeBuffer(s);
                String encString = new String(decoded);
                bw.append(encString);
                bw.newLine();
                bw.flush();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
