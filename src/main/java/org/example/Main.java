package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Employee ivan = new Employee("Ivan", "Igorevich",
                "Ovchinnikov", "8(495)000-11-22",
                "developer", 50000, 1985, 11, 21, Employee.Genders.MALE);
        Employee andrey = new Employee("Andrey", "Viktorovich",
                "Bezrukov", "8(495)111-22-33",
                "fitter", 52000, 1973, 5, 18, Employee.Genders.MALE);
        Employee evgeniy = new Employee("Evgeniy", "Viktorovich",
                "Delfinov", "8(495)222-33-44",
                "project manager", 40000, 1963, 3, 15, Employee.Genders.MALE);
        Employee natalia = new Employee("Natalia", "Pavlovna",
                "Keks", "8(495)333-44-55",
                "senior developer", 90000, 1990, 5, 6, Employee.Genders.FEMALE);
        Employee tatiana = new Employee("Tatiana", "Sergeevna",
                "Krasotkina", "8(495)444-55-66",
                "accountant", 50000, 1983, 6, 9, Employee.Genders.FEMALE);
        Manager kolya = new Manager("Kolya", "Aleksandrovich", "Bulla",
                "8(495)222-55-99", "teamLid", 100000, 1974, 11, 21, Employee.Genders.MALE);

        Employee[] employees = {ivan, andrey, evgeniy, natalia, tatiana, kolya};

        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        Manager.increaser(employees, 45, 5000);
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        System.out.println("Среднняя ЗП: " + Employee.averageSalary(employees));
        System.out.println("Среднний возраст: " + Employee.averageAge(employees));

        for (Employee e : employees) {
            System.out.println(e.compare(9, 6, 1983));
        }

       Employee.celebrate(employees);

    }
}