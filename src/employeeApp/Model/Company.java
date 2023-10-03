package employeeApp.Model;

import java.util.Arrays;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            this.giro = 0;
        } else this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        try {
            if (developerNames[index] != null || !developerNames[index].trim().isEmpty()) {
                System.out.println("index = " + index + " is not null");
            } else developerNames[index] = name;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("index = " + index + " is out of Array length");
        }
    }

        /*
        Amacımız developerNames dizisine parametre olarak gelen name değerini atamak.
        İlgili index değeri dizi içerisinde boşsa parametre olarak gelen ```name``` değişkeni ilgili indexe yazılmalı.
        İlgili index doluysa dolu olduğuna dair bir mesaj verilmeli.
        İlgili index değerinin dizi içerisinde hiç var olmadığı durumda kontrol edilmeli.
        */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: " + id + "\n");
        sb.append("name: " + name + "\n");
        sb.append("giro: " + giro + "\n");
        sb.append("developerNames: " + Arrays.toString(developerNames) + "\n");
        return sb.toString();
    }
}
