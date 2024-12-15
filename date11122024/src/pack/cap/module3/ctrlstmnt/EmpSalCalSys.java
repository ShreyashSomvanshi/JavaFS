package pack.cap.module3.ctrlstmnt;

/*
 * You are tasked with creating an Employee Salary Calculation System in Java. 
 * The system should be able to calculate various components of an employee's salary, 
 * such as Basic Salary, House Rent Allowance (HRA), Travel Allowance (TA), Dearness Allowance (DA), and Perks.

Additionally, you need to:
Instance Methods: Use instance methods to calculate the salary components (e.g., Basic Salary, HRA, DA) based on an individual employee's information.
Static Methods: Use static methods to calculate common deductions or allowances that apply to all employees, such as the Company-wide perk rate or a standard deduction percentage.
Instance Variables: Represent employee-specific attributes (e.g., name, department, basic salary) using instance variables.
Static Variables: Use static variables for company-wide constants (e.g., company-wide perk percentage or the tax rate).
 */



class Employee {
    private String name;
    private String department;
    private double basicSalary;

    private static double HRA_PERCENTAGE = 0.20;
    private static double TA_AMOUNT = 1500; 
    private static double DA_PERCENTAGE = 0.10; 
    private static double PERK_PERCENTAGE = 0.05; 

    // Constructor
    public Employee(String name, String department, double basicSalary) {
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }
    
    
//    public void EmpSal() {
//    	System.out.println("HRA: "+basicSalary * HRA_PERCENTAGE);
//    	System.out.println("DA: "+basicSalary * DA_PERCENTAGE);
//    	System.out.println("Perks: "+basicSalary * PERK_PERCENTAGE);
//    }
    
    public double calculateHRA() {
        return basicSalary * HRA_PERCENTAGE;
    }

    public double calculateDA() {
        return basicSalary * DA_PERCENTAGE;
    }

    public double calculatePerks() {
        return basicSalary * PERK_PERCENTAGE;
    }

    public double calculateTotalSalary() {
        return basicSalary + calculateHRA() + calculateDA() + TA_AMOUNT + calculatePerks();
    }


    // show employee details
    public String getEmpDetails() {
        return "name: "+name+", Dept: "+department+", salary: "+basicSalary;
    }
}

public class EmpSalCalSys {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Emp 1", "IT", 50000);
        System.out.println("Employee Details: " + emp1.getEmpDetails());
//        System.out.println("Employee Salary Details: " + emp1.EmpSal());
        System.out.println("HRA: " + emp1.calculateHRA());
        System.out.println("DA: " + emp1.calculateDA());
//        System.out.println("Travel Allowance: " + Employee.TA_AMOUNT);
        System.out.println("Perks: " + emp1.calculatePerks());
        System.out.println("Total Salary: " + emp1.calculateTotalSalary());

        
        Employee emp2 = new Employee("Emp 2", "Sales", 55000);
        System.out.println("Employee Details: " + emp2.getEmpDetails());
        System.out.println("HRA: " + emp2.calculateHRA());
        System.out.println("DA: " + emp2.calculateDA());
        System.out.println("Perks: " + emp2.calculatePerks());
        System.out.println("Total Salary: " + emp2.calculateTotalSalary());
    }
}

