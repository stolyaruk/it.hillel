package it.hillel.hw17;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Make a Call from Android");
    }

    @Override
    public void sms() {
        System.out.println("Send SMS from Android");
    }

    @Override
    public void internet() {
        System.out.println("Connect to Internet from Android");
    }
}
