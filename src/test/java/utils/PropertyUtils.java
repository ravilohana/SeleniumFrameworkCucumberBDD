package utils;

import java.io.*;
import java.util.Properties;

public class PropertyUtils {

    public static Properties propertyLoader(String filePath){


        Properties prop = new Properties();
        BufferedReader bufferedReader;

        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            try {
                prop.load(bufferedReader);
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to load properties file: " + filePath);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Properties file not found at: " + filePath);
        }

        return prop;
    }




}
