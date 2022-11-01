package EmpWage;

public class Employee_wage {
	 int Fulltime =1;
	 int wageperhr=20;
      double empcheck =(int)(Math.random()*2);
      int emphrs;
      int empwage;
   public void Check_Emp_Is_PresentorAbsent() {
	   if (empcheck==Fulltime) {
		 	  emphrs=8;
		   }
		 	  else {
		 		  emphrs=0;
		 	  }
	   empwage = emphrs*wageperhr;
	   System.out.println("Daily Employee Wages:"+empwage);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to Employee Wage Computation Program");
Employee_wage emp=new Employee_wage();
emp.Check_Emp_Is_PresentorAbsent() ;
	}
}


