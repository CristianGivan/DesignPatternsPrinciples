package learndesignpatterns.observer;

public class main {
    public static void main(String[] args) {
        Observable chanel1 = new Chanel();
        Observer subscriber1 =new Subscriber();
        Observer subscriber2 =new Subscriber();
        Observer subscriber3 =new Subscriber();
        chanel1.creatObserver(subscriber1);
        chanel1.creatObserver(subscriber2);
        chanel1.creatObserver(subscriber3);
        chanel1.updateObserver("Fiml nou");
    }
}
