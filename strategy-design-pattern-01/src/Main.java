//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // create context object
        Context context = new Context(new Sum());
        int contextSum = context.executeStrategy(40,60);
        System.out.println("Sum = "+contextSum);

        context = new Context(new Subtraction());
        int contextSub = context.executeStrategy(40,60);
        System.out.println("Subtraction = "+contextSub);

        Context mulObj = new Context(new Multiply());
        int mulObjValue = mulObj.executeStrategy(40,60);
        System.out.println("Multiplication = "+mulObjValue);
    }
}