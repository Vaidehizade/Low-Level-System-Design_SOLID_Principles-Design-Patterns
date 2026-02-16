package BehaviouralDesignPattern.ObserverPattern.GoodCode;

import java.util.ArrayList;
import java.util.List;

interface Observers {
    void update(float temp);
}

interface Subject{
    void attach(Observers obs);
    void detach(Observers obs);
    void notifyObservers();
}

class DisplayDevice implements Observers{
    String name;
    public DisplayDevice(String deviceName){
        this.name = deviceName;
    }
    @Override
    public void update(float temp) {
        System.out.println("temperature...."+temp);
    }
}
class MobileDevice implements Observers{

    String name1;
    public MobileDevice(String mobileDeviceName){
        this.name1 = mobileDeviceName;
    }
    @Override
    public void update(float temp) {
        System.out.println("temperature...."+temp);
    }
}

class WeatherStation implements Subject{
    private float temperature;
    private List<Observers> observersList;

    WeatherStation(){
        observersList = new ArrayList<>();
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
    }

    @Override
    public void attach(Observers obs) {
        observersList.add(obs);
    }

    @Override
    public void detach(Observers obs) {
        observersList.remove(obs);
    }

    @Override
    public void notifyObservers() {
     for(Observers obs: observersList){
         obs.update(temperature); // Run time polymorphism
     }

    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {
        //publisher
        WeatherStation ws = new WeatherStation();
        //subscriber
        DisplayDevice dt = new DisplayDevice("Google TV");
        MobileDevice mt = new MobileDevice("Samsung mobile");
        ws.attach(dt);
        ws.attach(mt);

        ws.setTemperature(25);
        ws.setTemperature(28);

    }
}
