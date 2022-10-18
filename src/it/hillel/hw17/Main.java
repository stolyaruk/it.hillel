package it.hillel.hw17;

public class Main {
    public static void main(String[] args) {
        Androids androids = new Androids();
        IPhones iPhones = new IPhones();

        androids.call();
        androids.sms();
        androids.internet();

        iPhones.call();
        iPhones.sms();
        iPhones.internet();

    }
}
