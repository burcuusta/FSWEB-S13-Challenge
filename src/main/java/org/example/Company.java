package org.example;

public class Company {


        private int id;
        private String name;
        private double giro;
        private String[] developerNames;

        public Company(int id, String name, double giro, String[] developerNames) {
            this.id = id;
            this.name = name;
            this.giro = giro;
            this.developerNames = developerNames;
        }
    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Invalid index!");
            return;
        }
        if (developerNames[index] == null) {
            developerNames[index] = name;
        } else {
            System.out.println("Position already filled!");
        }
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getGiro() {
        return giro;
    }
    public String[] getDeveloperNames() {
        return developerNames;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGiro(double giro) {
        this.giro = Math.max(giro, 0);
    }
    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }
    @Override
    public String toString() {
        return "Company{id=" + id + ", name='" + name + "', giro=" + giro + "}";
    }
}


