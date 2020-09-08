package main.java.yaksha;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PhoneBook ph=new PhoneBook();
		 Scanner sc=new Scanner(System.in);
		 int ch;
		do{
		System.out.println("====Menu====");
		
		System.out.println("1.Add Contact");
		System.out.println("2.Display all contacts");
		System.out.println("3.Search contact by phone");
		System.out.println("4.Remove contact");
		System.out.println("5.Exit");
		System.out.println("Enter your choice: ");
	    ch=sc.nextInt();

	    switch(ch) {
	    case 1:
	    	
	    	System.out.println("Add Contact: ");
			System.out.println("Enter the First Name: ");
			String firstName=sc.next();
			System.out.println("Enter the Last Name: ");
			String lastName=sc.next();
			System.out.println("Enter the Phone No.:");
			long phoneNumber=sc.nextLong();
			System.out.println("Enter the Email:");
			String emailId=sc.next();
			Contact c=new Contact(firstName, lastName, phoneNumber, emailId);
	    	
	    	ph.addContact(c);
	    	break;
		case 2:
 			List<Contact> phoneBook =ph.viewAllContacts();
 			for(Contact con:phoneBook) {
 				System.out.println("First Name:"+con.getFirstName());
 				System.out.println("Last Name:"+con.getLastName());
 				System.out.println("Phone No.:"+con.getPhoneNumber());
 				System.out.println("Email: "+con.getEmailId());
 			} 
	    	
	    	break;
		case 3:
			System.out.println("Enter the Phone number to search contact:");
			long searchNumber=sc.nextLong();
			Contact c2=ph.viewContactGivenPhone(searchNumber);
			    System.out.println(c2.getFirstName());
				System.out.println(c2.getLastName());
				System.out.println(c2.getPhoneNumber());
				System.out.println(c2.getEmailId());
	
	        break;
		case 4:
			boolean success=false;
			System.out.println("Enter the Phone number to remove :");
			long removeNumber=sc.nextLong();
			System.out.println("Do you want to remove the contact (Y/N):");
			String check=sc.next();
			
			if(check.equals("Y"))
			{
				success=ph.removeContact(removeNumber);
			}
			if(success) {
				System.out.println("The contact is successfully deleted.");
			}else {
				System.out.println("The phone number is not available" );

			}
			break;
		case 5:
			
			System.exit(0);
			break;   
	    
	    }
		}while(ch<5);
	}

}
