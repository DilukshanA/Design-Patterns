//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class singleObject {

    // private constructor
    private singleObject(){}

    // create private static instance
    private static singleObject instance = new singleObject();

    // return the instance to create objects
    public static singleObject getObject(){
        if(instance == null){
            instance = new singleObject();
        }
        return instance;
    }

    public void showText(){
        System.out.println("This is singleton pattern");
    }

}


public class Main {
    public static void main(String[] args) {
        singleObject obj = singleObject.getObject();
        obj.showText();
    }
}