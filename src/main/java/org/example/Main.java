package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        String[] developerNames = new String[3];
        Company company = new Company(1, "Workintech", 1000000.0, developerNames);
        company.addEmployee(0, "Burcu");
        company.addEmployee(1, "Enis");
        company.addEmployee(1, "Doğancan");
        company.addEmployee(3, "Ece");

        Healthplan plan = new Healthplan(1, "Standard Health", Plan.BASIC);

        String[] healthplans = new String[3];
        Employee employee = new Employee(5, "Burcu Usta", "burcu@burcu.com", "123", healthplans);
        employee.addHealthplan(0, "Basic Health");
        employee.addHealthplan(1, "Premium Health");
        employee.addHealthplan(1, "Premium Health");
        employee.addHealthplan(3, "VIP Health");


        System.out.println(company);
        System.out.println(plan);
        System.out.println(employee);
    }
     }
