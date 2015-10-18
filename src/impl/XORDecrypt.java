package impl;

import interfaces.BaseArrayString;
import interfaces.Decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GEO on 18.10.15.
 */
public class XORDecrypt extends Decorator{

    public XORDecrypt(BaseArrayString base) {
        super(base);
    }

    @Override
    public List<String> readFrom(String pathFileFrom) {
        return super.readFrom(pathFileFrom);
    }

    @Override
    public void writeTo(List<String> strArr, String pathFileTo) {
        super.writeTo(strArr, pathFileTo);
    }


    @Override
    public void writeTo(List<String> innArr, String pathDecriptedFileTo, String secretKey) {

        List<String> outArr=new ArrayList<String>();
        char[] key = secretKey.toCharArray();

        for(String s: innArr) {
            char[] input = s.toCharArray();
            char[] output = new char[input.length];

            if (key.length == 0) {
                throw new IllegalArgumentException("empty security key");
            }
            int spos = 0;
            for (int pos = 0; pos < input.length; pos++) {
                output[pos] = (char) (input[pos] ^ key[spos]);
                spos++;
                if (spos >= key.length) {
                    spos = 0;
                }
            }
            outArr.add(new String(output));
        }
        super.writeTo(outArr,pathDecriptedFileTo);
    }

}
