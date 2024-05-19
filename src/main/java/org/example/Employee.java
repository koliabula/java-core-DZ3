package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private static final int CURRENT_YEAR = 2024;
    String name;
    String midName;
    String surName;
    String phone;
    String position;
    int salary;
    int birth;
    int bMonth;
    int bDay;


    int getAge() {
        return CURRENT_YEAR - birth;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", midName='" + midName + '\'' +
                ", surName='" + surName + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + getAge() +
                '}';
    }

    public static void increaser(Employee[] emp, int age, int increment) {
        for (Employee e : emp) {
            if (e.getAge() > age) {
                e.salary += increment;
            }
        }
    }

    public static float averageSalary(Employee[] emp) {
        float result = 0;
        for (Employee e:
             emp) {
            result += e.salary;
        }
        return result / emp.length;
    }

    public static float averageAge(Employee[] emp){
        float result = 0;
        for (Employee e:
                emp) {
            result += e.getAge();
        }
        return result / emp.length;
    }

    public int compare(int dd, int mm, int yyyy) {

        int empl = bDay + (bMonth << 6) + (birth << 11);
        int income = dd + (mm << 6) + (yyyy << 11);
        return empl - income;
    }


}

