package taskLesson;

public class Name {
	private String firstName;
	private String middleName;
	private String lastName;

	Name(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public String toString() {
		return "User name is " + firstName + " " + middleName + " " + lastName + "";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}
}
