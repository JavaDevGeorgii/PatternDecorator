package impl;

import interfaces.BaseArrayString;
import interfaces.Decorator;
import sun.misc.BASE64Encoder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GEO on 15.10.15.
 */
public class BaseArray64Encrypt extends Decorator {

    BASE64Encoder base64Encoder;

    public BaseArray64Encrypt(BaseArrayString baseArrayString) {
        super(baseArrayString);
    }

    private List<String> stringList;

    @Override
    public List<String> readFrom(String pathFileFrom) {

        stringList = new ArrayList<String>();
        return super.readFrom(pathFileFrom);
    }

    @Override
    public void writeTo(List<String> strings, String pathFileTo) {
        base64Encoder = new BASE64Encoder();
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(pathFileTo));
            for (String s : strings) {
                byte[] utf8 = s.getBytes("UTF-8");
                String encString = base64Encoder.encode(utf8);
                bw.append(encString);
                bw.newLine();
                bw.flush();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException ioex) {
            ioex.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
