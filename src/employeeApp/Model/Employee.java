package employeeApp.Model;

import java.util.Arrays;

public class Employee {

    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    public void addHealthplan(int index, String name) {

        try {
            if (healthplans[index] != null || !healthplans[index].trim().isEmpty()) {
                System.out.println("index = " + index + " is not null");
            } else healthplans[index] = name;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("index = " + index + " is out of Array length");
        }
    }
        /*
        Amacımız healthplans dizisine parametre olarak gelen name değerini atamak.
        İlgili index değeri dizi içerisinde boşsa parametre olarak gelen ```name``` değişkeni ilgili indexe yazılmalı.
        İlgili index doluysa dolu olduğuna dair bir mesaj verilmeli.
        İlgili index değerinin dizi içerisinde hiç var olmadığı durumda kontrol edilmeli.
        */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: " + id + "\n");
        sb.append("fullName: " + fullName + "\n");
        sb.append("email: " + email + "\n");
        sb.append("password: " + password + "\n");
        sb.append("healthplans: " + Arrays.toString(healthplans) + "\n"); //Yine Arraylerin de RAM deki yeri dönmemesi için Arrays.toString() methodu ile Stringe çeviririz.
        return sb.toString();
    }
}
