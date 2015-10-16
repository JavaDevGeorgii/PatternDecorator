package interfaces;

import java.util.List;

/**
 * Created by GEO on 15.10.15.
 */
public abstract class Decorator implements BaseArrayString {

    protected BaseArrayString baseArrayString;

    public Decorator(BaseArrayString baseArrayString) {
        baseArrayString = baseArrayString;
    }

    @Override
    public List<String> getListString() {
        return null;
    }
}
