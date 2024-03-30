package org.example;

public class Tester {
    // Поля класса
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    // Перегрузка конструкторов
    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0.0); // Вызов предыдущего конструктора
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "Beginner"); // Вызов предыдущего конструктора
    }

    // Перегруженные методы
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Experience in years: " + experienceInYears);
        System.out.println("English level: " + englishLevel);
        System.out.println("Salary: " + salary);
    }

    public void printInfo(boolean detailed) {
        if (detailed) {
            printInfo();
        } else {
            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
        }
    }

    public void printInfo(String additionalInfo) {
        System.out.println("Additional Info: " + additionalInfo);
        printInfo();
    }

    // Статический метод
    public static void staticMethodExample() {
        System.out.println("This is a static method.");
    }

}


