import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        Employee.setEmployeeNumber();

        System.out.print("Enter base Salary: ");
        int baseSalary= scanner.nextInt();

        System.out.print("Enter Hourly Rate: ");
        int hourlyRate= scanner.nextInt();

        System.out.print("Enter Over Time: ");
        int overTime= scanner.nextInt();

        var employee1 = new Employee(baseSalary,hourlyRate,overTime);
        var employee2 = new Employee(baseSalary,hourlyRate);

        int wage=employee1.calculateWage();
        int wage2=employee2.calculateWage();
        System.out.println("Wage1 is "+wage);
        System.out.println("Wage2 is "+wage2);





    }

}

