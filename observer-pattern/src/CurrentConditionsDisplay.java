public class CurrentConditionsDisplay implements IObserver{

    private float temperature;
    private float humidity;
    private  float pressure;

    public CurrentConditionsDisplay(){

    }

    @Override
    public void update(float temperature , float humidity , float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();

    }

    public void display(){
        System.out.println("Temperature : "+temperature);
        System.out.println("Humidity : "+humidity);
        System.out.println("Pressure : "+pressure);
    }
}
