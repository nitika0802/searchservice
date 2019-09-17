package com.sample.project.search.configuration;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ReadProperties {

   static Properties properties = new Properties();
   static String fileName = "config.properties";
   InputStream in = null;
    public List<String> getProperties() {
        List<String> propValues = new ArrayList<>();
        try {
           in =  getClass().getClassLoader().getResourceAsStream(fileName);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            properties.load(in);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        propValues.add(properties.getProperty("MaximumFetchResults"));
        propValues.add(properties.getProperty("BookSearchURL"));
        propValues.add(properties.getProperty("AlbumSearchURL"));
        return propValues;
    }
}
