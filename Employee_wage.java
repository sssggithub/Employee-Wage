package EmpWage;

public class Employee_wage {
	static final int Fulltime =1;
	static final int Parttime=2;
	 int wageperhr=20;
      double empcheck =(int)(Math.random()*3);
      int fulldayhr;
      int empwage;
   public void Check_Emp_Is_PresentorAbsent() {
	   if (empcheck==Fulltime) {
	    	  System.out.println("Employee is present");
	      }
	   else if(empcheck==Parttime){
		   System.out.println("Employee is present for Half Time");
	   }
	   else {
	    		  System.out.println("Employee is absent");
	    	  }
   }
   public void Daily_Emp_Wage() {
	   if (empcheck==Fulltime) {
		    fulldayhr=8;
		 	 System.out.println("Employee Hour:"+ fulldayhr);
		   }
	   else if(empcheck==Parttime){
			fulldayhr=4;
			System.out.println("Employee Hour:"+ fulldayhr);
		}
	    	 
		 	  else {
		 		  fulldayhr=0;
		 		 System.out.println("Employee Hour:"+ fulldayhr);
		 	  }
	   empwage = fulldayhr*wageperhr;
	   System.out.println("Daily Employee Wages:"+empwage);
   }
   public void usingswitchcase() {
	   switch((int)empcheck) {
		case Fulltime :
	    	  fulldayhr=8;
	      break;
		case Parttime:
			fulldayhr=4;
		break;
	    	  default:
	    		  fulldayhr=0;
	    	  }
		empwage = fulldayhr*wageperhr;
		System.out.println("Emp wage: "+empwage);
   }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to Employee Wage Computation Program");
Employee_wage emp=new Employee_wage();
emp.Check_Emp_Is_PresentorAbsent() ;
emp.Daily_Emp_Wage();
emp.usingswitchcase();

	}
}


