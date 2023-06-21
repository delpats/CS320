package contact;
import java.util.ArrayList; //Importing Array

public class ContactService {
	ArrayList<Contact> contacts;

	public ContactService() {
		contacts = new ArrayList<>();
	}

	// Add contacts via unique ID's
	public boolean addContact(Contact newContact) {
		boolean contains = false;
		for (Contact c : contacts) {
			if (c.getContactId().equalsIgnoreCase(newContact.getContactId())) {
				System.out.println("Contact added successfully.");
				contains = true;
			}
		}
		
		// If contact is already in system
		if (!contains) {
			contacts.add(newContact);
			return true;
		} else {
			System.out.println("Contact already in system.");
			return false;
		}
	}

	// Delete contacts via contact ID
	public boolean deleteContact(String contactID) {
		for (Contact c : contacts) {
			if (c.getContactId().equalsIgnoreCase(contactID)) {
				contacts.remove(c);
				System.out.println("Contact deleted successfully.");
				return true;	
			}
		}
		System.out.println("Contact not found.");
		return false;	
	}

	// Update First name
	public boolean updateFirstName(String contactID, String newFirstName) {
		for (Contact c : contacts) {
			if (c.getContactId().equalsIgnoreCase(contactID)) {
				c.setFirstName(newFirstName);
				System.out.println("First name updated successfully.");
				return true;
			}
		}
		System.out.println("Contact not found.");
		return false;
	}

	// Update Last name 
	public boolean updateLastName(String contactID, String newLastName) {
		for (Contact c : contacts) {
			if (c.getContactId().equalsIgnoreCase(contactID)) {
				c.setLastName(newLastName);
				System.out.println("Last name updated successfully.");
				return true;
			}
		}
		System.out.println("Contact not found.");
		return false;
	}

	// Update phone number
	public boolean updatePhoneNumber(String contactID, String newNumber) {
		@SuppressWarnings("unused")
		int intValue;
		for (Contact c : contacts) {
			if (c.getContactId().equalsIgnoreCase(contactID)) {
				c.setPhoneNumber(newNumber);
			}
			
				//This checks if the phone number is integers only
				try {
					intValue = Integer.parseInt(newNumber);
					System.out.println("Phone number updated successfully.");
					return true;
				}
				catch (NumberFormatException e) {
					System.out.println("Error, please try again.");
				}
				return false;
			}
		System.out.println("Contact not found.");
		return false;
				
	}
				
	
	// Update Address
	public boolean updateAddress(String contactID, String newAddress) {
		for (Contact c : contacts) {
			if (c.getContactId().equalsIgnoreCase(contactID)) {
				c.setAddress(newAddress);
				System.out.println("Address updated successfully.");
				return true;
			}
		}
		System.out.println("Contact not found.");
		return false;
	}
	
	// Print all info
	public void printAllContacts() {
		for(Contact c: contacts) {
			System.out.println(c.toString());
		}
	}
}
	
