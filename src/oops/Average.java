package oops;

public class Average {

	double num1,num2,num3;
	
	public void setNumbers(double num1, double num2, double num3) {
		
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	
	public double calcAverage() {
	return num1=num2+num3/3;
		
	}
	public void printAverage() {
		System.out.println("The average of 3 numbers is:"+calcAverage());
	}
}
