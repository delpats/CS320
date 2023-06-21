package contact;

public class Contact {
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String contactId,String firstName,String lastName,String phoneNumber,String address){
		if(contactId.length() <= 10 && contactId != null) {
			this.contactId = contactId;
		}
		else {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhoneNumber(phoneNumber);
		this.setAddress(address);
	}

	public void setFirstName(String firstName) {
		if(firstName.length() <= 10 && firstName != null) {
			this.firstName = firstName;
		}
		else {
			throw new IllegalArgumentException("Invalid Name");
		}
	}

	public void setLastName(String lastName) {
		if(lastName.length() <= 10 && lastName != null) {
			this.lastName = lastName;
		}
		else {
			throw new IllegalArgumentException("Invalid Name");
		}
	}

	public boolean setPhoneNumber(String phoneNumber) {
		
		@SuppressWarnings("unused")
		int intValue;
		if(phoneNumber.length() == 10 && phoneNumber != null) {
			this.phoneNumber = phoneNumber;
		}
		else {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
	
		//This checks if the phone number is integers only
		try {
			intValue = Integer.parseInt(phoneNumber);
			return true;
		}
		catch (NumberFormatException e) {
			System.out.println("Error, please try again");
		}
		return false;
	}
	

	
	public void setAddress(String address) {
		if(address.length() <= 30 && address != null) {
			this.address = address;
		}
		else {
			throw new IllegalArgumentException("Invalid Address");
		}
	}

	public String getContactId() {
		return contactId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "[ Contact ID: " + contactId + ", First Name: " + firstName + ", Last Name: " + lastName
				+ ", Phone Number: " + phoneNumber + ", Address: " + address + " ]";
	}
}