import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Employee {

    private String name;
    private int salary;
    private int empid;

    void set_name(String name) {

        this.name = name;
    }

    void set_empid(int empid) {

        this.empid = empid;
    }

    void set_salary(int salary) {

        this.salary = salary;
    }

    String get_name() {

        return name;
    }

    int get_empid() {

        return empid;
    }

    int get_salary() {

        return salary;
    }

    public String toString() {

        return name + " " + empid + " " + salary;
    }

    public Employee(String name, int empid, int salary) {

        this.name = name;
        this.salary = salary;
        this.empid = empid;

    }
}

class Employee_Details {

    Scanner Scan = new Scanner(System.in);

    ArrayList<Employee> l1 = new ArrayList<>();

    void add_Emp() {
        System.out.println("--- Enter New Employee Details ---");

        System.out.println("Enter employee name : ");
        String name = Scan.nextLine();

        System.out.println("Enter employee's id : ");
        int empid = Scan.nextInt();

        System.out.println("Enter salary of employee : ");
        int salary = Scan.nextInt();

        Scan.nextLine();

        Employee e1 = new Employee(name, empid, salary);

        l1.add(e1);

        System.out.println("Employee added successfully!");

    }

    void View_Emp() {

        System.out.println("Employee details are");

        Iterator<Employee> itr = l1.iterator();

        while (itr.hasNext()) {

            Employee e2 = itr.next();

            System.out.println(e2);

        }
    }

    void update_Emp() {

        boolean check = false;
        System.out.println("enter empid for updating details : ");
        int empid = Scan.nextInt();

        Iterator<Employee> itr = l1.iterator();

        while (itr.hasNext()) {

            Employee e2 = itr.next();

            if (e2.get_empid() == empid) {

                System.out.println("Employee found !");

                System.out.println("Enter number for changing field");
                System.out.println("Enter 1 for changing name");
                System.out.println("Enter 2 for changing salaey");

                int num = Scan.nextInt();

                Scan.nextLine();
                check = true;

                switch (num) {
                    case 1:
                        System.out.println("Enter new name of employee");
                        String name = Scan.nextLine();
                        e2.set_name(name);
                        System.out.println(e2);
                        break;
                    case 2:
                        System.out.println("ENter new salary for employee");
                        int salary = Scan.nextInt();
                        e2.set_salary(salary);
                        System.out.println(e2);
                        break;

                    default:
                        System.out.println("give correct input");
                        break;
                }
                return;

            }

        }
        if (check == false) {

            System.out.println("No employee is found with this Empid ");
        }

    }

    void delete_Emp() {
        boolean check = false;

        System.out.println("Enter empid for deleting Employee ");
        int empid = Scan.nextInt();

        Scan.nextLine();

        Iterator<Employee> itr = l1.iterator();

        while (itr.hasNext()) {

            Employee e1 = itr.next();

            if (e1.get_empid() == empid) {

                itr.remove();
                System.out.println("Employee delete succesfully");
                check = true;

                break;
            }

        }
        if (check == false) {

            System.out.println("No employee is found with this Empid ");

        }

    }

}

public class Employee_Management {

    public static void main(String []  args){
        

        Employee_Details e1= new Employee_Details();
        
        Scanner Scan = new Scanner(System.in);
        int choice;
        
        do{
            
            
            System.out.println("------------------------------ ");
            System.out.println("Enter 1 for Adding Employee Details : ");
            System.out.println("Enter 2 for Viewing Employee Details ");
            System.out.println("Enter 3 for Updating Employee details: ");
            System.out.println("Enter 4 for Deleting Employee details :");
            System.out.println("Enter 5 for Exit :");
            System.out.println("------------------------------ ");
            
            choice = Scan.nextInt();
            
            
            switch(choice){
                
                case 1:
                    e1.add_Emp();
                    break;
                case 2:
                    e1.View_Emp();
                    break;
                case 3:
                    e1.update_Emp();
                    break;
                            
                case 4:
                    e1.delete_Emp();
                    break;
                case 5:
                    System.out.println("Thanks you ! you are Exited");
            
                                    
                                    
                default:
                    System.out.println("eneter correct input");   
                }
            }while(choice!=5);
            
                



    }

        

}
