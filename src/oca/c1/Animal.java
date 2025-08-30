package oca.c1;

public class Animal {
    public String especie;

    public Animal() {
        especie = "ET";
        // System.out.println("Animal constructor called");
    }

    public String move() {
        return "Animal moves";
    }

    protected String eat() {
        return "Animal eats All kinds of food";
    }

    String sleep() {
        return "Animal sleeping";
    }

    private String drink() {
        return ("Animal drinking");
    }

}
