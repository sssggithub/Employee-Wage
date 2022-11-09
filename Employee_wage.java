package EmpWage;

public class Employee_wage {
	 static final int Fulltime =1;
	 static final int Parttime=2;
	 static final int wageperhr=20;
	 static final int workingday=20;
     static final int hrsinmonth=100;	 
     public static int switch_case() {
      int fulldayhr;
      int empwage;
      int totalempwage;
      int totalemphrs=0;
	  int totalworkingdays=0;
      while(totalemphrs<=hrsinmonth && totalworkingdays<workingday) {
	    	 totalworkingdays++; 
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
	   totalemphrs+=fulldayhr;
		System.out.println("day: "+totalworkingdays + "emp hrs :"+fulldayhr);
	   }
      totalempwage=totalemphrs*wageperhr;
	     System.out.println("Total Employee Wage:"+totalempwage);
	     return totalempwage;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to Employee Wage Computation Program");
switch_case();
	}
}


