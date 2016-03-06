package main.java;

import java.util.Scanner;
/**create a instance of a phonebook
 * prints the current phone directory
 *
		    *switch statement for menu,
		    *add function,
		    *delete function,
		    *change,
		    *get number,
		    *printl
		    *@param choice for switch
		    *@param name for new entry name
		    *@param number for new entry number
 * @author Leek
 *
 */
public class Driver extends PhoneDirectory{
	
	public static void main(String[] s) {
		
	   PhoneDirectory book = new PhoneDirectory();
	   
	   System.out.println("This is the current Phone Directory");
	   
	   book.print();
	   
	   int choice = 0;
	   Scanner in = new Scanner(System.in);
	   String name, number;
	  
	   do{ 
		   
		    
		   
		   
		   System.out.println("What would you like to do with this Directory?");
		   System.out.println("Press 1 to add an entry");
		   System.out.println("Press 2 to delete an entry");
		   System.out.println("Press 3 to change an entry");
		   System.out.println("Press 4 to get a number from an entry");
		   System.out.println("Press 5 to print new directory");
		   System.out.println("Press 0 to exit program");
		   
		   choice = in.nextInt();
		   in.nextLine();
		   switch(choice){
		   case 1: //add function
			   System.out.println("Enter the name you want to add and press enter");
			   name = in.nextLine();
			   name.trim();
			   System.out.println("Enter the number and press enter");
			   number = in.nextLine();
			   book.addEntry(name, number);
			   break;
	   
		   case 2: //delete function
			   System.out.println("Enter the name you want to delete and press enter");
			   name = in.nextLine();
			   name.trim();
			   book.deleteEntry("John Doe");
			   break;
		   case 3: //change
			   System.out.println("Enter the name you wish to change and press enter");
			   name = in.nextLine();
			   name.trim();
			   System.out.println("Enter the number and press enter");
			   number = in.nextLine();
			   book.changeEntry(name, number);
			   break;
		   case 4: //get number
			   //	shows funcitonality of getNumber function
			   System.out.println("Enter the name you wish to recieve a number for and press enter");
			   name = in.nextLine();
			   name.trim();
			   System.out.println(book.getNumber(name));
			   break;
		   case 5: //print directory
			   //prints list after changes
			   book.print();
			   break;
		   default:
			   break;
	   }
	   }while(choice != 0);	   
	   
	   
	   in.close();
	}
}

