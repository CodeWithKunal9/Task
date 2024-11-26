package com.sorting;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String dep;
    private int salary;
    private LocalDate date;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDep() {
        return dep;
    }
    public void setDep(String dep) {
        this.dep = dep;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public Employee(String name, String dep, int salary, LocalDate date) {
        super();
        this.name = name;
        this.dep = dep;
        this.salary = salary;
        this.date = date;
    }
    @Override
    public String toString() {
        return name + " , " + dep + " , " + salary + "," + date;
    }



}