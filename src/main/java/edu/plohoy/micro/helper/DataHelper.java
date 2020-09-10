package edu.plohoy.micro.helper;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

public class DataHelper implements Serializable{

    public byte[] getDataFromFile(String filePath) throws IOException {
        InputStream stream = getClass().getResourceAsStream(filePath);
        byte[] data = new byte[1024];
        while (stream.available() > 0) {
            stream.read(data);
        }
        return data;
    }
}
