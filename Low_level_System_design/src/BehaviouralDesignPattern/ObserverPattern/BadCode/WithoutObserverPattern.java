package BehaviouralDesignPattern.ObserverPattern.BadCode;

class DisplayDevice {

   public void showTemp(float temp){
       System.out.println("Current Temp: "+ temp + " C");
   }
}
class WeatherStation {

    private float temperature;
    private final DisplayDevice displayDevice; // can be multiple such devices late on

    public WeatherStation(DisplayDevice displayDevice){
        this.displayDevice = displayDevice;
    }

    public void setTemperature(float temp){
        this.temperature = temp;
    }

    public void notifyDevice(){
        displayDevice.showTemp(temperature);
    }

}
public class WithoutObserverPattern {
    public static void main(String[] args) {
       DisplayDevice device = new DisplayDevice();
        //tight coupling between station and device
       WeatherStation station = new WeatherStation(device);
       station.setTemperature(26);
       station.setTemperature(30);
    }
}
