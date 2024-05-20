package objectwitharray;

import java.util.Scanner;

public class RunEmployeeArray {

	public static void main(String[] args) {
		Employee emp[] = new Employee[10];
		 Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<emp.length;i++) {
			
			Employee e = new Employee();
			e.setId(i);
		}
	}
}
