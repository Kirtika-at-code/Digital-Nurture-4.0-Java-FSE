public class Logger {

    private static Logger instance;

    private Logger(){
        System.out.println("This is an example of Singleton Pattern");
    }
    
    public static Logger getInstance(){
        if(instance==null){
            instance=new Logger();
        }
        return instance;
    }

    public void print(String msg){
        System.out.println(msg);
    }
}
