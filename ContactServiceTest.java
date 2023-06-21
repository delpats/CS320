package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import contact.Contact;
import contact.ContactService;

class ContactServiceTest {

	@BeforeEach
	public void beforeEach() {
		System.out.println("Test Started");
	}
	
	@AfterEach
	public void afterAll() {
		System.out.println("Test Complete");
	}


	@Test
	public void testAddContact() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("00001", "Joe", "Smith", "5551234567", "123 Lakeview Road");
		Contact c2 = new Contact("00002", "Dan", "Jones", "5551238901", "555 Overview Drive");
		assertEquals(true, cs.addContact(c1));
		assertEquals(true, cs.addContact(c2));
	}
	
	@Test
	public void testAddContactFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("00001", "Joe", "Smith", "5551234567", "123 Lakeview Road");
		Contact c2 = new Contact("00002", "Dan", "Jones", "5551238901", "555 Overview Drive");
		assertEquals(true, cs.addContact(c1));
		assertEquals(false, cs.addContact(c1));
		assertEquals(true, cs.addContact(c2));
		assertEquals(false, cs.addContact(c2));
	}

	@Test
	public void testDeleteFunctionPass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("00001", "Joe", "Smith", "5551234567", "123 Lakeview Road");
		Contact c2 = new Contact("00002", "Dan", "Jones", "5551238901", "555 Overview Drive");
		assertEquals(true, cs.addContact(c1));
		assertEquals(true, cs.addContact(c2));
		
		assertEquals(true, cs.deleteContact("00001"));
		assertEquals(true, cs.deleteContact("00002"));
	}
	
	@Test
	public void testDeleteFunctionFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("00001", "Joe", "Smith", "5551234567", "123 Lakeview Road");
		Contact c2 = new Contact("00002", "Dan", "Jones", "5551238901", "555 Overview Drive");
		assertEquals(true, cs.addContact(c1));
		assertEquals(true, cs.addContact(c2));
		
		assertEquals(false, cs.deleteContact("00003"));
	}
	
	@Test
	public void testUpdatePass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("00001", "Joe", "Smith", "5551234567", "123 Lakeview Road");
		Contact c2 = new Contact("00002", "Dan", "Jones", "5551238901", "555 Overview Drive");
		assertEquals(true, cs.addContact(c1));
		assertEquals(true, cs.addContact(c2));
		
		assertEquals(true, cs.updateFirstName("00001", "Joseph"));
		assertEquals(true, cs.updateLastName("00002", "Brooks"));
		assertEquals(true, cs.updateAddress("00002", "234 Elm Street"));
		assertEquals(true, cs.updatePhoneNumber("00001", "1234567890"));
	}
	
	@Test
	public void testUpdateFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("00001", "Joe", "Smith", "5551234567", "123 Lakeview Road");
		assertEquals(true, cs.addContact(c1));
		
		assertEquals(true, cs.updateFirstName("00001", "Joseph"));
		assertEquals(false, cs.updatePhoneNumber("00001", "AAAAAAAAAA"));
		assertEquals(false, cs.updateLastName("00002", "Brooks"));
	}
}


