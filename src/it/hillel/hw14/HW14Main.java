package it.hillel.hw14;

import java.util.Scanner;

public class HW14Main {
    public static void main(String[] args) {
        Person person1 = new Person("Will", "Smith", "New York", 2936729462846L);
        Person person2 = new Person("Jackie", "Chan", "Shanghai", 12312412412L);
        Person person3 = new Person("Sherlock", "Holmes", "London", 37742123513L);

        person1.userInfo();
        person2.userInfo();
        person3.userInfo();

    }
}
