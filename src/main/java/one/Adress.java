package one;

public class Adress{
	private String street;
	
	private String city;
	
	private String state;
	
	private int zip;;
	
	private String country;
	
	private Customer customer;

	public String getStreet() {
		return street;
	}

	public Adress(String street, String city, String state, int zip, String country, Customer customer) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.customer = customer;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Adress [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country="
				+ country + ", customer=" + customer + "]";
	}
	
	

}
