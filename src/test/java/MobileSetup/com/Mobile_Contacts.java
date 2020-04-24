package MobileSetup.com;

public class Mobile_Contacts {

	protected String UserName;
	protected int UserPhoneNumber;

	private Mobile_Contacts(String userName, int userPhoneNumber) {
		super();
		this.UserName = userName;
		this.UserPhoneNumber = userPhoneNumber;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public int getUserPhoneNumber() {
		return UserPhoneNumber;
	}

	public void setUserPhoneNumber(int userPhoneNumber) {
		UserPhoneNumber = userPhoneNumber;
	}
	
	
	public static Mobile_Contacts createContact(String name, int number) {
		return new Mobile_Contacts(name, number);
	}
	
	

}
