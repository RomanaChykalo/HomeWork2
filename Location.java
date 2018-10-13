package taskLesson;

public class Location {
	private String city;
	private String street;
	private String flatNumber;
	private Country country;

	Location(String city, String street, String flatNumber, Country country) {
		this.city = city;
		this.street = street;
		this.flatNumber = flatNumber;
		this.country = country;
	}
	public String toString(){
		return "From city: "+city+", street: "+street+", flat's number: "+flatNumber+", live in:"+country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
}
