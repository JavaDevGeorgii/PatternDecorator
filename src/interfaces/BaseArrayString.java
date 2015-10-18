package interfaces;

import java.util.List;

/**
 * Created by GEO on 15.10.15.
 */

public interface BaseArrayString  {

    public List<String> readFrom(String pathFileFrom);
    public void writeTo(List<String> stringList, String pathFileTo);
    public void writeTo(List<String> stringList, String pathFileTo, String key);
}
