package edu.plohoy.micro.helper;

import java.io.IOException;
import java.io.Serializable;

public class DataHelper implements Serializable {

    public int getDataFromFile(String filePath) throws IOException {
        return getClass().getResourceAsStream(filePath)
                .read();
    }
}
