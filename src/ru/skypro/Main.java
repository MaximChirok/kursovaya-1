package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void sumSalary (Employee[] employee) {
        int sum = 0;
        for (int i=0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        System.out.println("Traty na zarplatu sotrudnikam v etom mesyace = " + sum);
    }

    public static void maxSalary (Employee[] employee) {
        int maximum = -1;
        for (int i=0; i < employee.length; i++) {
            if (employee[i].getSalary() > maximum) {
                maximum = employee[i].getSalary();
            }
        }
        System.out.println("Maksimalnaya zarplata za mesyac " + maximum);
    }


    public static void minSalary (Employee[] employee) {
        int minimum = 2147483647;
        for (int i=0; i < employee.length; i++) {
            if (employee[i].getSalary() < minimum) {
                minimum = employee[i].getSalary();
            }
        }
        System.out.println("Minimalnaya zarplata za mesyac " + minimum);
    }



    public static void meanSalary (Employee[] employee) {
        int sum = 0;
        for (int i=0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        float mean = (float) sum / 10;
        System.out.println("Srednyaya trata na zarplatu sotrudnikam v etom mesyace = " + mean);
    }


    public static void printListEmployees (Employee[] employee) {
        for (int i=0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    public static void printFioEmployees (Employee[] employee) {
        for (int i=0; i < employee.length; i++) {
            System.out.println(employee[i].getFio());
        }
    }


    public static void main(String[] args) {


        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Ivanov Ivan Ivanovich", 1, 33_000);
        employee[1] = new Employee("Vasilev Vasya Vasilevich", 2, 39_000);
        employee[2] = new Employee("Yurev Yura Yurevich", 3, 33_250);
        employee[3] = new Employee("Kirillov Kirill Kirillovich", 4, 40_000);
        employee[4] = new Employee("Sergeev Sergei Sergeevich", 5, 31_200);
        employee[5] = new Employee("Danilov Danil Danilovich", 5, 37_000);
        employee[6] = new Employee("Petrov Petr Petrovich", 4, 48_000);
        employee[7] = new Employee("Maksimov Maksim Maksimovich", 3, 51_320);
        employee[8] = new Employee("Semenov Semen Semenovich", 2, 25_375);
        employee[9] = new Employee("Tihonov Tihon Tihonovich", 1, 43_432);

        System.out.println("Spisok sotrudnikov");
        System.out.println();
        printListEmployees(employee);
        System.out.println();
        System.out.println("Podschet zarplaty");
        System.out.println();
        sumSalary(employee);
        meanSalary(employee);
        maxSalary(employee);
        minSalary(employee);
        System.out.println();
        System.out.println("FIO sotrudnikov");
        System.out.println();
        printFioEmployees(employee);




















    }




}
