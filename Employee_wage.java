package EmpWage;

public class Employee_wage {
	 int Fulltime =1;
	 int parttime=2;
	 int wageperhr=20;
      double empcheck =(int)(Math.random()*3);
      int emphrs;
      int empwage;
   public void Check_Emp_Is_PresentorAbsent() {
	   if (empcheck==Fulltime) {
	    	  System.out.println("Employee is present");
	      }
	    	  else {
	    		  System.out.println("Employee is absent");
	    	  }
   }
   public void Daily_Emp_Wage() {
	   if (empcheck==Fulltime) {
		 	  emphrs=8;
		 	 System.out.println("Employee Hour:"+emphrs);
		   }
	 
		 	  else {
		 		  emphrs=0;
		 		 System.out.println("Employee Hour:"+emphrs);
		 	  }
	   empwage = emphrs*wageperhr;
	   System.out.println("Daily Employee Wages:"+empwage);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to Employee Wage Computation Program");
Employee_wage emp=new Employee_wage();
emp.Check_Emp_Is_PresentorAbsent() ;
emp.Daily_Emp_Wage();
	}
}


