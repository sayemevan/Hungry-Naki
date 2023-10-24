package utilities;

import register.Data;

import java.io.InputStream;
import java.util.Properties;

public class PropertyUtils {

    public static Properties getProperties(String propertyFilePath, String propertyFileName) {
        try {
            InputStream stream;
            stream = ClassLoader.getSystemResourceAsStream(propertyFilePath + propertyFileName + ".properties");
            Properties properties = new Properties();
            properties.load(stream);
            return properties;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getValue(Properties propertiesName, String uiObjectName){
        if (propertiesName.getProperty(uiObjectName) != null) {
            return propertiesName.getProperty(uiObjectName);
        } else {
            return null;
        }
    }

    public static void addOrReplaceValue(Properties propertiesName, String uiObjectKeyName, String uiObjectValue){
        if (propertiesName.getProperty(uiObjectKeyName) != null) {
            propertiesName.replace(uiObjectKeyName, uiObjectValue);
        } else {
            propertiesName.put(uiObjectKeyName, uiObjectValue);
        }
    }


}
