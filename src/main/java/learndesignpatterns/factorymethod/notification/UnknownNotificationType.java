package learndesignpatterns.factorymethod.notification;

public class UnknownNotificationType extends Exception{
    public UnknownNotificationType(String message) {
        super(message);
    }
}
