package com.sorting;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TableData {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Kunal Sehgal", "DCAP", 25000, LocalDate.of(2001, 10, 9)));
        employees.add(new Employee("Kunal Kavimandan", "DCAP", 28000, LocalDate.of(2001, 9, 28)));
        employees.add(new Employee("Aakash Syal", "DCAP", 22000, LocalDate.of(2000, 6, 19)));
        employees.add(new Employee("Yash Sehgal", "Disputes", 28000, LocalDate.of(2001, 8, 12)));
        employees.add(new Employee("Yash Sehgal", "Disputes", 20000, LocalDate.of(2001, 12, 30)));
        employees.add(new Employee("Ajay Patil", "EASI", 21000, LocalDate.of(2023, 10, 31)));

        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Number");
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("Details);
//
//            System.out.print("Name");
//            sc.nextLine();
//            String name = sc.nextLine();
//
//            System.out.print("Department");
//            String dept = sc.nextLine();
//
//            System.out.print("Salary");
//            int sal = sc.nextInt();
//
//            System.out.print("Date of Birth (YYYY-MM-DD): ");
//            sc.nextLine();
//            String dob = sc.nextLine();
//            LocalDate dateOfBirth = LocalDate.parse(dob);
//            employees.add(new Employee(name, dept, sal, dateOfBirth));
//        }

        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println();

        boolean flag = true;
        while (flag) {
            List<Employee> temp = new ArrayList<>(employees);
            System.out.println("Enter your options");
            System.out.println("1. For sorting by Name");
            System.out.println("2. For sorting by Name and Department");
            System.out.println("3. For sorting by Name , Department and Salary");
            System.out.println("4. Sort by every field");
            System.out.println("5. EXIT");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Collections.sort(temp, new SortByName());
                    for (Employee emp : temp) {
                        System.out.println(emp);
                    }
                    break;
                case 2:
                    Collections.sort(temp, new SortByDepartment());
                    for (Employee emp : temp) {
                        System.out.println(emp);
                    }
                    break;
                case 3:
                    Collections.sort(temp, new SortBySalary());
                    for (Employee emp : temp) {
                        System.out.println(emp);
                    }
                    break;
                case 4:
                    Collections.sort(temp, new SortByDOB());
                    for (Employee emp : temp) {
                        System.out.println(emp);
                    }
                    break;
                case 5:
                    flag = false;
                    break;

            }
            System.out.println("END");
//        Collections.sort(employees,new Sortings());
//        for(Employee emp : employees) {
//            System.out.println(emp);
//        }
        }
    }
}
