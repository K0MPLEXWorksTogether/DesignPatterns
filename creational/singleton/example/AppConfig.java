package creational.singleton.example;

import java.util.HashMap;

public class AppConfig {
    private HashMap<String, String> appData;
    private static AppConfig instance;

    private AppConfig(HashMap<String, String> config) {
        this.appData = config;
    }

    public static AppConfig getInstance(HashMap<String, String> config) {
        if (instance == null) {
            instance = new AppConfig(config);
        }

        return instance;
    }

    public HashMap<String, String> getConfigData() {
        return appData;
    }
}
