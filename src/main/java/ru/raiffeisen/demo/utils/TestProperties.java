package ru.raiffeisen.demo.utils;

import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    private static Properties properties;
    private static TestProperties INSTANCE;
    private TestProperties () {
        properties = new Properties();
        try {
            properties.load(new FileInputStream(new File(System.getProperty("environment") + ".properties")));
            System.out.println(properties);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static TestProperties getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TestProperties();
        }
        return INSTANCE;
    }
    public Properties getProperties(){
        return properties;
    }

}
