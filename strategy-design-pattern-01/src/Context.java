public class Context {
    private Strategy strategy;

    public Context (Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int a , int b){
        return strategy.mathFunction(a , b);
    }
}
