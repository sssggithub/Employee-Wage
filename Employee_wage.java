package EmpWage;

public class Employee_wage {
	static final int Fulltime =1;
	static final int Parttime=2;
	 static final int wageperhr=20;
	 public static final int workingday=20;
      int fulldayhr;
      int empwage;
      int totalempwage;
      
  
   public void switch_case() {
	   for(int day=0;day<workingday;day++) {
		      double empcheck =(int)(Math.random()*3);
		   
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
		totalempwage+=empwage;
		System.out.println("Emp wage: "+empwage);
	   }
	   System.out.println(" Total Emp wage: "+totalempwage);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to Employee Wage Computation Program");
Employee_wage emp=new Employee_wage();
emp.switch_case();
	}
}


