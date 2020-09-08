package main.java.yaksha;

import java.util.ArrayList;

import java.util.List;

public class PhoneBook {
	private List<Contact> phoneBook = new ArrayList<Contact>();

	public List<Contact> getPhoneBook() {
		return phoneBook;
	}

	public void setPhoneBook(List<Contact> phoneBook) {
		this.phoneBook = phoneBook;
	}

	public boolean addContact(Contact contactObj) {
		List<Contact> c=getPhoneBook();
		c.add(contactObj);
		setPhoneBook(c);
		return true;
		
	}
	public List<Contact> viewAllContacts(){
		     
		return phoneBook; 
		 
	
	} 
		
	
	public Contact viewContactGivenPhone(long phoneNumber) {
		List<Contact> c2=getPhoneBook();
		 for(Contact list1:c2) {
			 if(list1.getPhoneNumber()==phoneNumber) {
				return list1; 
			 }
		 }
		
		return (Contact) phoneBook;
	}
	public boolean removeContact(long phoneNumber) {
		List<Contact> c3=getPhoneBook(); 
		boolean status=false;
		for(Contact list1:c3) {
			 if(list1.getPhoneNumber()==phoneNumber) {
				 status=c3.remove(list1);
 			 return status;
			 }
		 }
		
		return status;
	}
	
	
}
