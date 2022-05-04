package ru.skypro;

public class Employee {
    public String fio;
    private int department;
    private int salary;
    private final int id;
    public static int counter;



    public Employee(String fio, int department, int salary) {
        this.fio = fio;
        this.salary = salary;
        this.department = department;
        this.id = counter++;
    }



    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getFio() {
        return fio;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return fio + " " + department + " " + salary;
    }

}
