package learndesignpatterns.observer;

public class Subscriber implements Observer {
    @Override
    public void notification(String videoName) {
        System.out.println("New video was release " + videoName);
    }
}
