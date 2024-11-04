//Subject interface
interface ISubject{
    public void registerObserver(IObserver o);
    public void removeObserver(IObserver o);
    public void notifyObserver();
}

//Observer interface
interface IObserver{
    public void update(float temperature , float humidity , float pressure);
}



