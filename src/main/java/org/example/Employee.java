package org.example;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthplans;
    }
    public void addHealthplan(int index, String name) {
        if (index < 0 || index >= healthPlans.length) {
            System.out.println("Invalid index!");
            return;
        }

        if (healthPlans[index] == null) {
            healthPlans[index] = name;
            System.out.println("Health plan added: " + name);
        } else if (healthPlans[index].equals(name)) {
            System.out.println("This plan is already added.");
        } else {
            System.out.println("Position already occupied!");
        }
    }
    public int getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }
    @Override
    public String toString() {
        return "Employee{id=" + id + ", fullName='" + fullName + "', email='" + email + "'}";
    }
}
