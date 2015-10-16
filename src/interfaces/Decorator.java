package interfaces;

/**
 * Created by GEO on 15.10.15.
 */
public abstract class Decorator implements BaseString{

    protected BaseString baseString;

    public Decorator(BaseString baseStr) {
        baseString = baseStr;
    }


    @Override
    public String getOriginalString() {
        return null;
    }
}
