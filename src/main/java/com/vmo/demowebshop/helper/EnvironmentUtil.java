package com.vmo.demowebshop.helper;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class EnvironmentUtil {
    private static final String CONFIG_FILE_FORMAT = "%s.properties";
    private static final String CURRENT_DIR = System.getProperty("user.dir");
    private static final String PROPERTIES_FILE_PATH = String.join(File.separator,CURRENT_DIR, "src", "test", "resources", "configs");
    private static final Properties properties = new Properties();

    public static void loadConfig(String env) {
        String configFile = String.format(CONFIG_FILE_FORMAT, env);
        try {
            FileInputStream file = new FileInputStream(String.join(File.separator, PROPERTIES_FILE_PATH, configFile));
            properties.clear();
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}

