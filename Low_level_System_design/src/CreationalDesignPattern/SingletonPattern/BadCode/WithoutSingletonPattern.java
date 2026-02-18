package CreationalDesignPattern.SingletonPattern.BadCode;

public class WithoutSingletonPattern {
    public static void main(String[] args) {
        // 2objects can point to two different api keys that will lead to inconsistency
        //2 api keys
        AppSettings appSettings = new AppSettings();
        AppSettings appSettingsCopy = new AppSettings();
        System.out.println(appSettingsCopy.getApiKey());
        System.out.println(appSettings.getApiKey());

        //More memory
        System.out.println(appSettings == appSettingsCopy);
        //we don't want another copy of object we wan't to avoid another copy of object
        //only one object of class should exist

    }
}
