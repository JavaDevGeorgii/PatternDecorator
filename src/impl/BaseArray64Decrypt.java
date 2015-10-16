package impl;

import interfaces.BaseArrayString;
import interfaces.Decorator;

/**
 * Created by GEO on 15.10.15.
 */
public class BaseArray64Decrypt extends Decorator{

    public BaseArray64Decrypt(BaseArrayString baseStr) {
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
