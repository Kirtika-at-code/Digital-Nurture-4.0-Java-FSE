public class Main {
    public static void main(String[] args){
        Logger instance1=Logger.getInstance();
        Logger instance2=Logger.getInstance();

        instance1.print("This is Instance 1");
        instance2.print("This is instance 2");

        if(instance1==instance2){
            System.out.println("Their is a single instance");
        }
    }
}
