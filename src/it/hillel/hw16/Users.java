package it.hillel.hw16;

import java.time.LocalDate;
import java.time.Period;

public class Users {
    private String firstName;
    public String lastName;
    private int day;
    private int month;
    private int year;
    private String email;
    private String phone;

    public double weight;
    public int bloodPressure;
    public int countOfSteps;

    public String getFirstName() {
        return firstName;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Users() {
    }

    public Users(String firstName, String lastName, int day, int month, int year, String email, String phone, double weight, int bloodPressure, int countOfSteps) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phone = phone;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.countOfSteps = countOfSteps;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(getYear(), getMonth(), getDay());
        return Period.between(birthDate, today).getYears();
    }

    public void printAccountInfo() {
        System.out.println("User personal data: ");
        System.out.println("Name: " + getFirstName().toUpperCase() + " " + lastName.toUpperCase());
        System.out.println("Age: " + getAge());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone num.: " + getPhone());
        System.out.println("Weight: " + weight);
        System.out.println("Blood pressure: " + bloodPressure);
        System.out.println("Count of steps: " + countOfSteps);
        System.out.println();
    }


}
