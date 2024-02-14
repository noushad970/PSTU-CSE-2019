/*import java.util.Scanner;

public class oop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 5 Person objects
        Person[] people = new Person[5];

        // Input data for 5 Person objects
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            // Create a Person object with the input data
            people[i] = new Person(name, age, id, salary);
        }

        // Display the details of all 5 Person objects
        System.out.println("\nDetails of 5 Person objects:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println(people[i]);
        }

        scanner.close();
    }
}

class Person {
    private String name;
    private int age;
    private int id;
    private double salary;

    // Constructor
    public Person(String name, int age, int id, double salary) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    // Override toString() method to display Person details
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", ID: " + id + ", Salary: " + salary;
    }
}*/

import java.util.Scanner;
class oop{
    public static void main(String[] args)
    {
        System.out.println("Enter the number of people: ");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        person[] p= new person[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter information for person : " +(i+1));
            System.out.println("Name: ");
            String name= s.nextLine();
            
            System.out.println("Id: ");
            String Id= s.nextLine();

            System.out.println("Age: ");
            int age= s.nextInt();
            s.nextLine();
            System.out.println("Salary: ");
            double salary= s.nextDouble();
            s.nextLine();
            
            p[i]= new person(name,age,Id,salary);
        }
        for(int i=0;i<n;i++)
        {
            p[i].info();
        }
    }
}
class person{
    String name;
    int age;
    String id;
    double salary;

    person(String name,int age,String id,double salary)
    {
        this.name= name;
        this.age= age;
        this.id= id;
        this.salary= salary;
    }
    public void info()
    {
        System.out.println("\nName: " +name +  "\nAge "+ age + "\nSalary: " + salary+"\nID: "+id);
    }
}