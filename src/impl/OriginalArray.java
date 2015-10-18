package impl;

import interfaces.BaseArrayString;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GEO on 15.10.15.
 */
public class OriginalArray implements BaseArrayString {

    private List<String> stringList;

    public OriginalArray() {
    }

    @Override
    public List<String> readFrom(String pathFileFrom) {

        stringList = new ArrayList<String>();
        String s;
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(pathFileFrom));
            while ((s = br.readLine()) != null) {
                stringList.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return stringList;
    }

    @Override
    public void writeTo(List<String> stringList, String pathFileTo) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(pathFileTo));
            for (String s : stringList) {
                bw.append(s);
                bw.newLine();
                bw.flush();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException ioex) {
            ioex.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void writeTo(List<String> stringList, String pathFileTo, String key) {

    }
}
