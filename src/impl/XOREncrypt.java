package impl;

import interfaces.BaseArrayString;
import interfaces.Decorator;

/**
 * Created by GEO on 15.10.15.
 */
public class XOREncrypt extends Decorator {

    public XOREncrypt(BaseArrayString baseStr) {
        super(baseStr);
    }

    @Override
    public String getOriginalString() {
        return super.getOriginalString()+" XOREncrypt";
    }


    public void returnNameEncryp(){
        System.out.println("#XOR");
    }
}
