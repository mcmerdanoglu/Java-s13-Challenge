package employeeApp;

import employeeApp.Model.Company;
import employeeApp.Model.Employee;
import employeeApp.Model.Healthplan;
import employeeApp.Model.Plan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan healthplan1 = new Healthplan(1,"Uygun", Plan.STANDART);
        Healthplan healthplan2 = new Healthplan(2,"Karlı", Plan.GOLD);
        Healthplan healthplan3 = new Healthplan(3,"Karlı", Plan.GOLD);
        Healthplan healthplan4 = new Healthplan(4,"Avantajlı", Plan.PREMIUM);

        String[] healthplans1 = new String[5];
        healthplans1[0] = healthplan1.getName();
        healthplans1[1] = healthplan2.getName();

        String[] healthplans2 = new String[4];
        healthplans2[0] = healthplan3.getName();
        healthplans2[1] = healthplan4.getName();

        Employee employee1 = new Employee(1,"cemoli","cem@test.com","1234",healthplans1);
        Employee employee2= new Employee(2,"memoli","memo@test.com", "12345", healthplans2);

        String[] developerNames1 = new String[3];
        developerNames1[0]= employee1.getFullName();
        developerNames1[1]=employee2.getFullName();

        Company company1= new Company(1,"workintech",10000,developerNames1);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(company1);
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
