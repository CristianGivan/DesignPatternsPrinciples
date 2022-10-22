package learndesignpatterns.factorymethod.notification;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("SMS sent");
    }
}
