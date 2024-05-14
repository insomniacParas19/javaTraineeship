package corejava_assignment;

import java.util.Scanner;

public class LibraryCatalog {
      
     String[] title;
     String[] author;
     String[] price;
     String[] publisher;
     String[] isbn;
     
     void printCatalog() {
    	 System.out.println(title+"\t"+author+"\t"+price+"\t"+publisher+"\t\t"+isbn);
     }
     
     public static void main(String[] args) {
		
    	 Scanner sc = new Scanner(System.in);
    	 final int MAX_INPUT = 2;
    	 String[] title = new String[MAX_INPUT];
         String[] author = new String[MAX_INPUT];
         String[] price = new String[MAX_INPUT];
         String[] publisher = new String[MAX_INPUT];
         String[] isbn = new String[MAX_INPUT];

         // Prompt the user for input until "endinput" is entered or maximum number of books is reached
         int numBooks = 0;
         for (int i = 0; i < MAX_INPUT; i++) {
             System.out.println("Enter the details of book #" + (i + 1) + " or type 'endinput' to stop:");
             title[i] = sc.nextLine();
             if (title[i].equalsIgnoreCase("endinput")) {
                 break;
             }
             author[i] = sc.nextLine();
             price[i] = sc.nextLine();
             publisher[i] = sc.nextLine();
             isbn[i] = sc.nextLine();
             numBooks++;
         }
         // Output
         System.out.println("\nBook Catalogue:");
         System.out.println("Title\tAuthor\tPrice\tPublisher\tISBN");
         for (int i = 0; i < numBooks; i++) {
             System.out.println( title[i]+"\t" + author[i]+"\t"+price[i]+"\t"+publisher[i]+"\t"+ isbn[i]);
            
         }
         
	}
}
