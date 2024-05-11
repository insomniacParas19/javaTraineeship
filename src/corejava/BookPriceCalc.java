package corejava;

import java.util.Scanner;

public class BookPriceCalc {
	

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        double[] bookPrices = new double[10];
        System.out.println("Enter the prices of 10 books:");

        for (int i = 0; i < bookPrices.length; i++) {
            System.out.print("Book " + (i + 1) + " price: ");
            bookPrices[i] = sc.nextDouble();
        }

        //total and average prices
        double total = totalprice(bookPrices);

        double average = avgprice(total, bookPrices.length);

        System.out.println("Total price of 10 books: " + total);
        System.out.println("Average price of 10 books: " + average);

        sc.close();
	}
	
	public static double totalprice(double[] prices) {
		double total=0;
		for(double price: prices) {
			total += price;
		}
		return total;
	}
	
	public static double avgprice(double totalprice, int count) {
		return totalprice/count;
	}
	

}
