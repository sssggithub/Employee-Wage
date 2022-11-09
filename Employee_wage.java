package EmpWage;

public class Employee_wage {
	 static final int Fulltime =1;
	 static final int Parttime=2; 
     public static int Empwage(String company,int wageperhr,int workingday,int hrsinmonth)  {
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
      System.out.println("Total Employee Wage For Company:" +company +" "+"is:" +totalempwage);
	     return totalempwage;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to Employee Wage Computation Program");
Empwage("Infosys", 20, 20, 100);
Empwage("Wipro", 50, 30, 200);
	}
}


