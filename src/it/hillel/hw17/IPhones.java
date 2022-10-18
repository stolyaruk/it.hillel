package it.hillel.hw17;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Make a Call from iOS");
    }

    @Override
    public void sms() {
        System.out.println("Send SMS from iOS");
    }

    @Override
    public void internet() {
        System.out.println("Connect to Internet from iOS");
    }
}
