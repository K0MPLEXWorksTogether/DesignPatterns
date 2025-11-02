package creational.singleton.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> configuration = new HashMap<>();

        configuration.put("App Name", "Sample App");
        configuration.put("App URI", "https://example.com");

        AppConfig config1 = AppConfig.getInstance(configuration);
        HashMap<String, String> appConfig1 = config1.getConfigData();
        for (Map.Entry<String, String> entry : appConfig1.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), entry.getValue());
        }

        AppConfig config2 = AppConfig.getInstance(configuration);
        HashMap<String, String> appConfig2 = config2.getConfigData();
        for (Map.Entry<String, String> entry : appConfig2.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), entry.getValue());
        }
    }
}
