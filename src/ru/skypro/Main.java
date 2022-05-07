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
        int maximum = employee[0].getSalary();
        for (int i=0; i < employee.length; i++) {
            if (employee[i].getSalary() > maximum) {
                maximum = employee[i].getSalary();
            }
        }
        System.out.println("Maksimalnaya zarplata za mesyac " + maximum);
    }


    public static void minSalary (Employee[] employee) {
        int minimum = employee[0].getSalary();
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
        float mean = (float) sum / employee.length;
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

    public static void comparisonSalaryMin (Employee[] employee, int zp) {
        for (int i=0; i < employee.length; i++) {
            if(employee[i].getSalary() <= zp) {
                System.out.println(employee[i].getId()+ " " + employee[i].getFio() + " " + employee[i].getSalary());
            }
        }
    }

    public static void comparisonSalaryMax (Employee[] employee, int zp) {
        for (int i=0; i < employee.length; i++) {
            if(employee[i].getSalary() >= zp) {
                System.out.println(employee[i].getId()+ " " + employee[i].getFio() + " " + employee[i].getSalary());
            }
        }
    }

    public static void printStaffDepartment (Employee[] employee, int dp) {
        for (int i=0; i < employee.length; i++) {
            if(employee[i].getDepartment() == dp) {
                System.out.println(employee[i].getId() + " " + employee[i].getFio() + " " + employee[i].getSalary());
            }
        }
    }

    public static void indexSalary (Employee[] employee, float index) {
        for (int i=0; i < employee.length; i++) {
            System.out.println(employee[i].getFio() + " " + (employee[i].getSalary()+employee[i].getSalary()*index));
        }
    }

    public static void sumDepartmentSalary (Employee[] employee, int dp) {
        int sum = 0;
        for (int i =0; i < employee.length; i++) {
            if (employee[i].getDepartment() == dp) {
                sum = sum + employee[i].getSalary();
            }
        }
        System.out.println("Zarplata otdela za mesyac = " + sum);
    }


    public static void indexDepartmentSalary (Employee[] employee, int dp, float index) {
        for (int i =0; i < employee.length; i++) {
            if (employee[i].getDepartment() == dp) {
                System.out.println(employee[i].getFio() + " " + employee[i].getDepartment() + " " + (employee[i].getSalary()+employee[i].getSalary()*index));
            }
        }
    }


    public static void meanDepartmentSalary (Employee[] employee, int dp) {
        int worker = 0;
        int sum = 0;
        float meanSalary;
        for (int i =0; i < employee.length; i++) {
            if (employee[i].getDepartment() == dp) {
                worker = worker + 1;
                sum = sum + employee[i].getSalary();
            }
        }
        meanSalary = sum / worker;
        System.out.println("Srednyaya zarplata otdela = " + meanSalary);
    }

    public static void minDepartmnetSalary (Employee[] employee, int dp) {
        int min = employee[0].getSalary();
        for (int i =0; i < employee.length; i++) {
            if (employee[i].getSalary() < min && employee[i].getDepartment() == dp) {
                min = employee[i].getSalary();
            }
        }
        System.out.println("Minimalnaya zarplata otdela = " + min);
    }

    public static void maxDepartmnetSalary (Employee[] employee, int dp) {
        int max = employee[0].getSalary();
        for (int i =0; i < employee.length; i++) {
            if (employee[i].getSalary() > max && employee[i].getDepartment() == dp) {
                max = employee[i].getSalary();
            }
        }
        System.out.println("Minimalnaya zarplata otdela = " + max);
    }














    public static void main(String[] args) {


        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Ivanov Ivan Ivanovich", 1, 10_000);
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
        System.out.println();
        System.out.println("Sotrudniki s malenkoi zarplatoi");
        comparisonSalaryMin(employee, 35_000);
        System.out.println();
        System.out.println("Sotrudniki s bolshoi zarplatoi");
        comparisonSalaryMax(employee, 36_000);
        System.out.println();
        System.out.println("Spisok sotrudnikov otdela");
        printStaffDepartment(employee, 1);
        System.out.println();
        System.out.println("Proindeksirovannay zarplata sotrudnikov");
        indexSalary(employee, 0.03f);
        System.out.println();
        System.out.println("Zarplata otdela");
        sumDepartmentSalary(employee, 1);
        System.out.println();
        System.out.println("Indeksirovanie zarplaty otdela");
        indexDepartmentSalary(employee, 1, 0.3f);
        System.out.println();
        meanDepartmentSalary(employee, 1);
        System.out.println();
        minDepartmnetSalary(employee, 1);
        System.out.println();
        maxDepartmnetSalary(employee, 1);





















    }




}
