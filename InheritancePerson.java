import java.util.Scanner;

class Person {
    String Name;
    String Gender;
    String Address;
    int Age;

    public Person(String Name, String Gender, String Address, int Age) {
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
        this.Age = Age;
    }
}

class Employee extends Person {
    String Empid;
    String Company_Name;
    String Qualification;
    String Salary;

    public Employee(String Name, String Gender, String Address, int Age,
                    String Empid, String Company_Name, String Qualification, String Salary) {
        super(Name, Gender, Address, Age);
        this.Empid = Empid;
        this.Company_Name = Company_Name;
        this.Qualification = Qualification;
        this.Salary = Salary;
    }
}

class Teacher extends Employee {
    String Teacherid;
    String Department;
    String Subject;

    public Teacher(String Name, String Gender, String Address, int Age,
                   String Empid, String Company_Name, String Qualification, String Salary,
                   String Teacherid, String Department, String Subject) {
        super(Name, Gender, Address, Age, Empid, Company_Name, Qualification, Salary);
        this.Teacherid = Teacherid;
        this.Department = Department;
        this.Subject = Subject;
    }

    public void display() {
        System.out.println("\nEmployee Details");
        System.out.println("Name: " + Name);
        System.out.println("Gender: " + Gender);
        System.out.println("Address: " + Address);
        System.out.println("Age: " + Age);
        System.out.println("Employee ID: " + Empid);
        System.out.println("Company Name: " + Company_Name);
        System.out.println("Qualification: " + Qualification);
        System.out.println("Salary: " + Salary);
        System.out.println("\nTeacher Details");
        System.out.println("Teacher ID: " + Teacherid);
        System.out.println("Department: " + Department);
        System.out.println("Subject: " + Subject);
    }
}

public class InheritancePerson {
    public static void main(String Args[]) {
        System.out.println("\nName : TOBIN K TOMY\nRoll No : 23MCA059\nDate : 06/04/2024");
        System.out.println("Program 12: Details of Teachers ");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline left by nextInt()

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for teacher " + (i+1) + ":");
            System.out.print("Name: ");
            String Name = sc.nextLine();
            System.out.print("Gender: ");
            String Gender = sc.nextLine();
            System.out.print("Address: ");
            String Address = sc.nextLine();
            System.out.print("Age: ");
            int Age = sc.nextInt();
            sc.nextLine(); // Consume newline left by nextInt()
            System.out.print("Employee ID: ");
            String Empid = sc.nextLine();
            System.out.print("Company Name: ");
            String Company_Name = sc.nextLine();
            System.out.print("Qualification: ");
            String Qualification = sc.nextLine();
            System.out.print("Salary: ");
            String Salary = sc.nextLine();
            System.out.print("Teacher ID: ");
            String Teacherid = sc.nextLine();
            System.out.print("Department: ");
            String Department = sc.nextLine();
            System.out.print("Subject: ");
            String Subject = sc.nextLine();

            teachers[i] = new Teacher(Name, Gender, Address, Age, Empid, Company_Name,
                    Qualification, Salary, Teacherid, Department, Subject);
        }

        System.out.println("\nDisplaying details of all teachers:");
        for (int i = 0; i < n; i++) {
            teachers[i].display();
            System.out.println("\n");
        }
    }
}
