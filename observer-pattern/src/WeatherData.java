import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject{

    private float temperature;
    private float humidity;
    private float pressure;

    private final List<IObserver> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(IObserver o:observers){
            o.update(temperature , humidity , pressure);
        }
    }


    public float[] getMeasurements(float temperature , float humidity , float pressure){
        return new float[] {temperature, humidity, pressure};
    }

    public void SetMeasurements(float temperature , float humidity , float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }
}
