package CreationalDesignPattern.SingletonPattern.GoodCode;

import CreationalDesignPattern.SingletonPattern.GoodCode.AppSettings;

public class SingletonPattern {
    public static void main(String[] args) {
        AppSettings appSettings = AppSettings.getInstance();
        AppSettings appSettingsCopy = AppSettings.getInstance();
        System.out.println(appSettingsCopy.getApiKey());
        System.out.println(appSettings.getApiKey());
        System.out.println(appSettings == appSettingsCopy);
    }
}
