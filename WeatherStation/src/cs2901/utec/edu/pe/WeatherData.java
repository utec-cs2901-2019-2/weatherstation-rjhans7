package cs2901.utec.edu.pe;

import java.util.Random;
public class WeatherData implements Subject {

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers ){
            observer.update();
        }
    }

    public int getTemperature(){
        Random rand = new Random();
        int temperature = rand.nextInt(50);
        temperature -= 25;
        return temperature;
    }
    public  int getHumidity(){
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public int getPresure(){
        Random rand = new Random();
        return rand.nextInt(1000);
    }
}
