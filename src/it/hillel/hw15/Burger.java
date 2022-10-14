package it.hillel.hw15;

public class Burger {
    public String bun;
    public String meat;
    public String cheese;
    public String vegs;
    public String mayonnaise;

    public Burger(String bun, String meat, String cheese, String vegs, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.vegs = vegs;
        this.mayonnaise = mayonnaise;

        System.out.println(bun + ", " + meat + ", " + cheese + ", " + vegs + ", " + mayonnaise + ".");
    }

    public Burger(String bun, String meat, String cheese, String vegs) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.vegs = vegs;

        System.out.println(bun + ", " + meat + ", " + cheese + ", " + vegs + ".");
    }
}


