package taskLesson;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User extends AbstractEntity {

	private Name fullName;
	private LocalDate dateOfbirthday;
	private String email;
	private PhoneNumber phoneNumber;
	private Location address;
	private List<Order> orders = new ArrayList<>();
	private List<ProductCategory> favouriteCategories = new ArrayList<>();

	public User(Name fullName, LocalDate dateOfbirthday, String email, PhoneNumber phoneNumber, Location address) {
		this.fullName = fullName;
		this.dateOfbirthday = dateOfbirthday;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public void addCategory(À) {
		favouriteCategories.add(category);
	}

	public void removeCategory(ProductCategory category) {
		favouriteCategories.remove(category);
	}

	public void removeAllCategories() {
		favouriteCategories.clear();
	}

	public String toString() {
		return fullName + " " + " date of birthday " + dateOfbirthday + ", " + "email: " + email + " " + phoneNumber
				+ " " + address;
	}

	public String getOrders() {
		return "List of orders is " + orders;
	}

	public LocalDate getDateOfbirthday() {
		return dateOfbirthday;
	}

	public Location getAddress() {
		return address;
	}

	public Name getFullName() {
		return fullName;
	}

	public String getEmail() {
		return email;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

}