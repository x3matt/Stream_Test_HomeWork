
public class Address {

	String street;
	int houseNumber;
	public Address(String street, int houseNumber) {
		this.street = street;
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", houseNumber=" + houseNumber + "]";
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	
	}

