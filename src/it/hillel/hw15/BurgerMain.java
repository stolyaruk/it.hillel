package it.hillel.hw15;

public class BurgerMain {

    public static void main(String[] args) {

        System.out.print("Бургер №1 - склад: ");
        Burger burger1 = new Burger("булка", "м'ясо", "сир", "зелень", "майонез");
        System.out.print("Бургер №2 - склад: ");
        Burger burger2 = new Burger("булка", "м'ясо", "сир", "зелень");
        System.out.print("Бургер №3 - склад: ");
        Burger burger3 = new Burger("булка", "подвійне м'ясо", "сир", "зелень", "майонез");
        burger3.meat = "подвійне м'ясо";
    }
}
