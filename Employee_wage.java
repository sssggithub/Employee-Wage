package EmpWage;

public class Employee_wage {
	 static int Fulltime =1;
     static double empcheck =Math.floor(Math.random()*10)%2;
   public void Check_Emp_Is_PresentorAbsent() {
	   if (empcheck==Fulltime) {
		 	  System.out.println("Employee is present");
		   }
		 	  else {
		 		  System.out.println("Employee is absent");
		 	  }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to Employee Wage Computation Program");
Employee_wage emp=new Employee_wage();
emp.Check_Emp_Is_PresentorAbsent() ;
	}
}


