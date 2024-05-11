package arrayExample;

import java.util.Scanner;

public class printCity {

	public void cityNames() {
		String cities[] = new String[6];
		Scanner sc= new Scanner(System.in);
		
		for(int i=1; i<=6; i++) {
			System.out.println("Enter the name of cities");
			cities[i]=sc.nextLine();
			
			System.out.println("City names:" + cities[i]);
		}
		sc.close();
	}
	public static void main(String[] args) {
		printCity cn = new printCity();
		cn.cityNames();
	}
}
