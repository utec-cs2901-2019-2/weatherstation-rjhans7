package cs2901.utec.edu.pe;
import cs2901.utec.edu.pe.WeatherData;



public class CurrentCoditions implements Observer, DisplayElement {
    public CurrentCoditions(){

    }
    WeatherData weatherData = new WeatherData();

    @Override
    public void update() {

    }

    public void display(){
        System.out.println("The temperature is:");
        System.out.println(weatherData.getTemperature());
        System.out.println("The Humidity is:");
        System.out.println(weatherData.getHumidity());
        System.out.println("The Presure is:");
        System.out.println(weatherData.getPresure());

    }
}
