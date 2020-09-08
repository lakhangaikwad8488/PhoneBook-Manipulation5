package test.java.yaksha;
import main.java.yaksha.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testAddContact() throws IOException {
		long phone=77886655;
		Contact c=new Contact("Jhon", "Mathew",phone, "jn@gmail.com");
		PhoneBook pb=new PhoneBook();
		 TestUtils.yakshaAssert(TestUtils.currentTest(),pb.addContact(c)==true==true?"true":"false",TestUtils.businessTestFile);

		//assertTrue(pb.addContact(c));
	}
	@Test
	void testViewAllContacts() throws IOException {
 		PhoneBook pb=new PhoneBook();
 		//Contact con=new Contact("Jhon", "Mathew",784578456, "jn@gmail.com");
		List<Contact> c=pb.getPhoneBook();
		List<Contact> c1=pb.viewAllContacts();
		TestUtils.yakshaAssert(TestUtils.currentTest(),c==c1==true?"true":"false",TestUtils.businessTestFile);

		//assertEquals(true, c==c1);
		
	}
	@Test
	void testViewContactGivenPhone() throws IOException {
		PhoneBook pb=new PhoneBook();
		Contact c1=new Contact("Jhon", "Mathew",77886655, "jn@gmail.com");
        pb.addContact(c1);
		Contact c2=pb.viewContactGivenPhone(77886655);
		TestUtils.yakshaAssert(TestUtils.currentTest(),c2==c1==true?"true":"false",TestUtils.businessTestFile);

		//assertSame( c2 , c1 ); 
	}
	@Test
	void testRemoveContact() throws IOException {
		long phone=77886655;
		Contact c1=new Contact("Jhon", "Mathew",phone, "jn@gmail.com");
		PhoneBook pb=new PhoneBook();
		  pb.addContact(c1);
		TestUtils.yakshaAssert(TestUtils.currentTest(),pb.removeContact(77886655)==true==true?"true":"false",TestUtils.businessTestFile);

		//assertTrue(pb.removeContact(77886655));
	}

}
