package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;

import contact.Contact;

public class ContactTest {
	
	
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("beforeEach Called");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("afterAll called");
	}
	
	// Checking each value will run when correctly filled out
	@Test
	public void testContact() {
		Contact contact = new Contact("12345", "JunitTest1", "TestJunit1", "1234567890", "123 Elms Street Washington, DC");
		assertTrue(contact.getContactId().equals("12345"));
		assertTrue(contact.getFirstName().equals("JunitTest1"));
		assertTrue(contact.getLastName().equals("TestJunit1"));
		assertTrue(contact.getPhoneNumber().equals("1234567890"));
		assertTrue(contact.getAddress().equals("123 Elms Street Washington, DC"));
	}
	

	// Checking if an exception is thrown due to the name being too long
	@Test
	public void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("123456", "JunitTest1123123123123123123123123", "TestJunit1", "1234567890", "123 Elms Street Washington, DC");
		});		
		}
	}  
	

