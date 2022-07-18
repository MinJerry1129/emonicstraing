import java.io.*;
public class Employee {
   String name;
   int age;
   String designation;
   double salary;

   public Employee() {
   }
   
   public Employee(String empName, int empAge, String empDesig, double empSalary){
      name = empName;
      age = empAge;
      designation = empDesig;
      salary = empSalary;
   }

   public void empName(String empName) {
      name = empName;
   }

   public void empAge(int empAge) {
      age = empAge;
   }

   public void empDesignation(String empDesig) {
      designation = empDesig;
   }

   public void empSalary(double empSalary) {
      salary = empSalary;
   }

   public void printEmployee() {
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Designation:" + designation );
      System.out.println("Salary:" + salary);
   }
   
   public static void main(String args[]) {
      Employee empOne = new Employee();
      empOne.empName("Joe");
      empOne.empAge(28);
      empOne.empDesignation("Senior Software Engineer");
      empOne.empSalary(1000);
      empOne.printEmployee();

      Employee empTwo = new Employee("Smith", 29,"Senior developer", 1500);
      empTwo.printEmployee();
   }
}