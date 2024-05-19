package org.example;


public class Manager extends Employee {

    public Manager(String name, String midName, String surName, String phone, String position, int salary, int birth, int bMonth, int bDay) {
        super(name, midName, surName, phone, position, salary, birth, bMonth, bDay);
    }



    public static void increaser(Employee[] emp, int age, int increment) {
        for (Employee e : emp) {
            if(!(e instanceof Manager)) {
                if (e.getAge() > age) {
                    e.salary += increment;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", midName='" + midName + '\'' +
                ", surName='" + surName + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + getAge() +
                '}';
    }
}
