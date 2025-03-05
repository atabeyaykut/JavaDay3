package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());

        Wall wall = new Wall(5, 4);
        System.out.println("Area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("Width= " + wall.getWidth());
        System.out.println("Height= " + wall.getHeight());
        System.out.println("Area= " + wall.getArea());
    }
}
