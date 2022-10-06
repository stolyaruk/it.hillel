package it.hillel.hw14;

import java.util.Locale;

public class Person {
    public String firstName;
    public String lastName;
    public String city;
    public long phone;

    public Person() {
    }

    public Person(String firstName, String lastName, String city, long phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phone = phone;
    }

    public void personInfo() {
        System.out.println("Зателефонувати громадянину "+ firstName + " " + lastName + " із міста " + city + " можна за номером " + phone + ".");
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", city='" + city + '\'' +
//                ", phone=" + phone +
//                '}';
//    }
}
