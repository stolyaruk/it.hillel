package it.hillel.hw16;

public class TrackerMain {
    public static void main(String[] args) {
        Users user1 = new Users("John", "Travolta", 18, 2, 1954, "john.travolta@gmail.com", "+1-63-123-45-67", 105.5, 135, 3000);
        Users user2 = new Users("Keanu", "Reeves", 2, 9, 1964, "keanu.reeves@gmail.com", "+2-93-111-22-33", 80.3, 125, 12000);
        Users user3 = new Users("Johnny", "Depp", 9, 6, 1963, "johny.depp@gmail.com", "+3-50-222-33-44", 90.3, 130, 2000);
        Users user4 = new Users("Zendaya", "Coleman", 1, 9, 1996, "zendaya@gmail.com", "+4-67-333-44-55", 45.1, 120, 6000);
        Users user5 = new Users("Tim", "Roth", 14, 5, 1961, "tim.roth@gmail.com", "+5-99-987-65-43", 84.7, 140, 4000);

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
        user4.printAccountInfo();
        user5.printAccountInfo();

        user1.weight = 90;
        user1.countOfSteps = 9000;

        user2.weight = 78.8;

        user4.lastName = "Maree Stoermer Coleman";

        user5.countOfSteps = 8000;
        user5.bloodPressure = 130;
        user5.weight = 80.1;

        System.out.println("------------------------------------");
        System.out.println();

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
        user4.printAccountInfo();
        user5.printAccountInfo();
    }
}
