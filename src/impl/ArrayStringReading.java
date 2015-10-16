package impl;

import interfaces.BaseArrayString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by GEO on 15.10.15.
 */
public class ArrayStringReading extends BufferedReader implements BaseArrayString {

    

//    public OriginalString(Reader in, int sz, String originalString) {
//        super(in, sz);
//    }
//
//    public OriginalString(Reader in, String originalString) {
//        super(in);
//    }

    public ArrayStringReading(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {

        return super.readLine();
    }

    @Override
    public List<String> getListString() {
        return null;
    }
}
