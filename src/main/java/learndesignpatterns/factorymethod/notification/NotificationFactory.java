package learndesignpatterns.factorymethod.notification;

public class NotificationFactory {
    public Notification createNotification(String type) throws UnknownNotificationType {
        switch (type) {
            case "SMS":
                return new SMSNotification();
            case "Email":
                return new EmailNotification();
            default:
                throw new UnknownNotificationType("Notification type unknow!");
        }
    }
}
