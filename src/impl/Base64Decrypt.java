package impl;

import interfaces.BaseString;
import interfaces.Decorator;

/**
 * Created by GEO on 15.10.15.
 */
public class Base64Decrypt extends Decorator{

    public Base64Decrypt(BaseString baseStr) {
        super(baseStr);
    }

    @Override
    public String getOriginalString() {
        String cryptedStr=super.getOriginalString();

        return super.getOriginalString();
    }

    public void returnNameEncryp(){
        System.out.println("#BASE64 decoder");
    }
}
