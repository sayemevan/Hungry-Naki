package register;

import utilities.PropertyUtils;
import utilities.Utils;

import java.util.*;

public class Data {

    private static final String USER_PATH = System.getProperty("user.dir"),
                                CONFIG_FILE_PATH = "config//",
                                CONFIG_FILE_NAME = "configuration";

    private static Map<String, List<LinkedHashMap<String, String>>> excelSheetMap = new LinkedHashMap<>();

    static Properties configFile = PropertyUtils.getProperties(CONFIG_FILE_PATH, CONFIG_FILE_NAME);
    public static final long DEFAULT_MAX_WAIT_TIME = Integer.parseInt(configFile.getProperty("default_max_wait_time"));
    public static final String APP_PATH = configFile.getProperty("application_path"),
                        APP_LOCATOR_PATH = configFile.getProperty("application_locator_path"),

                        APP_LOCATOR_FILE_NAME = configFile.getProperty("application_locator_file_name"),
                        UTILITY_OBJECTS_FILE_NAME = configFile.getProperty("utility_objects_file_name"),
                        PLATFORM_NAME = configFile.getProperty("platform_name"),
                        DEVICE_NAME = configFile.getProperty("device_name"),
                        APP = USER_PATH + APP_PATH,
                        APP_PACKAGE = configFile.getProperty("application_package"),
                        APP_ACTIVITY = configFile.getProperty("application_activity"),
                        APPIUM_SERVER_URL = configFile.getProperty("appium_server_url"),
                        CURRENT_DATE_TIME = Utils.getCurrentDateAndTime("yyyy-MM-dd hh:mm:ss a").replace(":", " ").replace(" ", "-");

    public static Map<String, List<LinkedHashMap<String, String>>> getExcelSheetMap() {
        return excelSheetMap;
    }
}
