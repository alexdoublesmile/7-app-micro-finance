package edu.plohoy.micro.helper;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class DataHelperTest {

    @Test
    public void getDataFromFileTest() throws Exception {
        new DataHelper().getDataFromFile("/application.yml");
    }
}