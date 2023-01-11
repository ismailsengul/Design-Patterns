package Observer;

import java.util.ArrayList;
import java.util.Collection;

public class WeatherDataApplication {
    public static void main(String[] args) {

        // Create observable weather station
        WeatherStation weatherStation = new WeatherStation();

        // Create observers
        IWeatherDataObserver printer = new WeatherDataPrinter();
        IWeatherDataObserver aggregator = new WeatherDataAggregator();

        weatherStation.addObserver(printer);
        weatherStation.addObserver(aggregator);

        weatherStation.addData(new WeatherData("Temperature", 10));
        weatherStation.addData(new WeatherData("Temperature", 11));
        weatherStation.addData(new WeatherData("Temperature", 12));
        weatherStation.addData(new WeatherData("Temperature", 13));
        weatherStation.addData(new WeatherData("Temperature", 14));


    }
}

interface IWeatherDataObserver {
    void update(WeatherData weatherData);
}

class WeatherDataPrinter implements IWeatherDataObserver {

    @Override
    public void update(WeatherData weatherData) {
        System.out.println(weatherData);
    }
}

class WeatherDataAggregator implements IWeatherDataObserver {
    private int sum = 0;
    private int n = 0;

    @Override
    public void update(WeatherData weatherData) {
        this.sum +=weatherData.value;
        this.n++;
        double avg = (double) this.sum / (double) this.n;
        System.out.println("Average: " + avg);
    }
}

interface IWeatherDataObservable {
    void addObserver(IWeatherDataObserver weatherDataObserver);
    void removeObserver(IWeatherDataObserver weatherDataObserver);

    void notifyObservers(WeatherData weatherData);
}
class WeatherStation implements IWeatherDataObservable {
   Collection<IWeatherDataObserver> weatherDataObservers = new ArrayList<>();

   public void addData(WeatherData weatherData){
        this.notifyObservers(weatherData);
   }

    @Override
    public void addObserver(IWeatherDataObserver weatherDataObserver) {
        this.weatherDataObservers.add(weatherDataObserver);
    }

    @Override
    public void removeObserver(IWeatherDataObserver weatherDataObserver) {
        this.weatherDataObservers.remove(weatherDataObserver);
    }

    @Override
    public void notifyObservers(WeatherData weatherData) {
        this.weatherDataObservers.forEach(
                weatherDataObserver -> weatherDataObserver.update(weatherData)
        );
    }
}

class WeatherData {
    String name;
    int value;

    public WeatherData(String name, int value){
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value = value;
    }

    @Override
    public String toString(){
        return this.name + ": " + this.value;
    }
}

//OBSERVABLE
//  Single weather station
//      => Produces weather data(e.g. temperature)
//
//OBSERVERS
//  Multiple consumers of weather station data
//      => Prints everything to the screen
//      => Computes the average over time
