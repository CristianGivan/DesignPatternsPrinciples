package learndesignpatterns.smarthome;

public class Logger {
    private static Logger instance;

    private Logger(){}

    private static Logger getInstance(){
        if (instance==null){
           return new Logger();
        }
        return instance;
    }

}
