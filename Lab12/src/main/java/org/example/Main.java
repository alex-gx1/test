package org.example;

public class Main {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Иван", "Петров", 5, "Intermediate", 3000);
        Tester tester2 = new Tester("Анна", "Сидорова", 3, "Advanced");
        Tester tester3 = new Tester("Алексей", "Иванов");


        System.out.println("Тестировщик 1:");
        tester1.printInfo();

        System.out.println("\nТестировщик 2:");
        tester2.printInfo();

        System.out.println("\nТестировщик 3:");
        tester3.printInfo();

        // Вызов перегруженного метода printInfo(boolean detailed)
        System.out.println("\nТестировщик 1 (с детальной информацией):");
        tester1.printInfo(true);

        // Вызов перегруженного метода printInfo(String additionalInfo)
        System.out.println("\nТестировщик 2 (с дополнительной информацией):");
        tester2.printInfo("Работает в отделе автоматизации");

        // Вызов статического метода
        Tester.staticMethodExample();


        hello hello = new hello();
        hello.hello("Иван");
    }
}
