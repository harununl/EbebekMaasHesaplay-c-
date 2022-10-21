

package yeni;
import java.util.*;

public class Employee {
	
	 public String name;
	   public double salary;
	   public double workHours;
	   public int hireYear;

	  
	   
	   public Employee(String name,double salary,double workHours,int hireYear){
		   this.name = name;
		   this.hireYear = hireYear;
		   this.workHours = workHours;
		   this.salary = salary;
	   }


	 
	  public void setName(String name){
	    this.name = name;
	  }
	  public String getName(){
		    return this.name;

		  }
	  public double getSalary(){
	    return salary;

	  }
	  public void setSalary(double salary){
	    this.salary = salary;
	  }
	  public double getWorkHours(){
	    return workHours;

	  }
	  public void setWorkHours(double workHours){
	    this.workHours = workHours;
	  }
	  public int getHireYear(){
	    return hireYear;

	  }
	  public void setHireYear(int hireYear){
	    this.hireYear = hireYear;
	  }
	  
	
  public double raiseSalary() {
	  double raiseQuantity = 0;
		  int workYear = 2021 - hireYear;
		  
		  if(workYear < 10)
		  {
			  raiseQuantity = (salary - tax() + bonus())*0.05;
			
			
			 
		  }
		  else if(workYear >9 && workYear <20) {
			  
			  raiseQuantity = (salary - tax() + bonus()) * 0.10;
			 
		  }
		  else if(workYear > 19) {
			  
			  
			  raiseQuantity = (salary - tax() + bonus()) * 0.15;
			  
		  }
		  
		  return raiseQuantity;
		  
		 
	  }
	
	 
	  
	  public double  bonus() {
		  double bonusQuantity = 0;
		  
		  int workYear = 2021 - hireYear;
		  
		  if(workHours> 40) {
			  
			  bonusQuantity = ((workHours - 40) * 30);
			  
			 
		  }
		  else
		  {
			  System.out.println(0);
		  }
		  
		  return bonusQuantity;
	  }

	 public double tax() {
		 double taxQuantity = 0;
		  if(salary <1000) {
			  
			 
			  System.out.println("tax verilmiyor" + 0);
			  
			  
		  }
		  else {
			 
			  taxQuantity = salary * 0.03;
			  
		  }
		  
		  
			  
		  return taxQuantity;
		 
		  
	  }
	 
	
	 
	 
	 public String toString() {
		 
		 return String.format("Employee name:" + getName()+"\nEmployee salary: " + getSalary() + "\nEmployee Work Hours: " +getWorkHours()+ "\nEmployee Hire Year: " + getHireYear()+"\nBonus: " + bonus() + "\nRaise Salary: " + raiseSalary() + "\nTax: " + tax()   + "\nSalary with tax and bonus: " + (salary - tax() + bonus() ) + "\nTotal Salary: " + (salary + bonus() - tax() + raiseSalary()));
	 }
	 
	
	 
	 
}
	 
	  
	  
	  
	  
	  



















