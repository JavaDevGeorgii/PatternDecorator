package impl;

import interfaces.BaseString;
import interfaces.Decorator;

/**
 * Created by GEO on 15.10.15.
 */
public class XOREncrypt extends Decorator {

    public XOREncrypt(BaseString baseStr) {
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
