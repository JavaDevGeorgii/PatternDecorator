package interfaces;

import java.util.List;

/**
 * Created by GEO on 15.10.15.
 */
public abstract class Decorator implements BaseArrayString {

    protected BaseArrayString baseArrayString;

    public Decorator(BaseArrayString base) {
        baseArrayString = base;
    }

    @Override
    public List<String> readFrom(String pathFileFrom) {
        return baseArrayString.readFrom(pathFileFrom);
    }

    @Override
    public void writeTo(List<String> strArr, String pathFileTo) {
        baseArrayString.writeTo(strArr, pathFileTo);
    }

    @Override
    public void writeTo(List<String> stringList, String pathFileTo, String key) {
        baseArrayString.writeTo(stringList, pathFileTo, key);
    }
}
