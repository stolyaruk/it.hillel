package it.hillel.hw14;

import java.util.Locale;

public class Person {
    public String fName;
    public String lName;
    public String city;
    public long phone;
    public int age;
    public double money;

    public Person() {
    }

    public Person(String fName, String sName, String city, long phone) {
        this.fName = fName;
        this.lName = sName;
        this.city = city;
        this.phone = phone;
    }

    public void userInfo() {
        System.out.println("Зателефонувати громадянину "+ fName + " " + lName + " із міста " + city + " можна за номером " + phone + ".");
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "fName='" + fName + '\'' +
//                ", sName='" + sName + '\'' +
//                ", city='" + city + '\'' +
//                ", phone=" + phone +
//                ", age=" + age +
//                '}';
//    }
}
