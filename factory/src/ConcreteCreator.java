public class ConcreteCreator extends Creator {

    @Override
    public Product factoryMethod(String factoryType) {
        if (factoryType == null){
            return null;
        }
        if (factoryType.equalsIgnoreCase("A")){
            return new ConcreteProductA();
        }
        if (factoryType.equalsIgnoreCase("B")){
            return new ConcreteProductB();
        }
        return null;
    }
}
