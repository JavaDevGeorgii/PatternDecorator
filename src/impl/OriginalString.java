package impl;

import interfaces.BaseString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by GEO on 15.10.15.
 */
public class OriginalString extends BufferedReader implements BaseString{


    public OriginalString(Reader in, int sz, String originalString) {
        super(in, sz);
    }

    public OriginalString(Reader in, String originalString) {
        super(in);
    }

    public OriginalString(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {
        return super.readLine();
    }


    @Override
    public String getOriginalString() {
        return null;
    }
}
