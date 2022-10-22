package learndesignpatterns.factorymethod.notification;

public class SentNotification {
    public static void main(String[] args) {
        NotificationFactory notificationFactory=new NotificationFactory();
        try {
            Notification notificationSMS=notificationFactory.createNotification("SMS");
            Notification notificationMail=notificationFactory.createNotification("Email");
            notificationSMS.notifyUser();
            notificationMail.notifyUser();
        }catch (UnknownNotificationType e){
            System.out.println(e);
        }
        try {
            Notification notificationUnknown=notificationFactory.createNotification("Unknow");
        }catch (UnknownNotificationType e){
            System.out.println(e);
        }



    }
}
