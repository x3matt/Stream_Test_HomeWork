
public class BankAccount {

	String IBANN;
	Person owner;
	public BankAccount(String iBANN, Person owner) {
		super();
		IBANN = iBANN;
		this.owner = owner;
	}
	public String getIBANN() {
		return IBANN;
	}
	public Person getOwner() {
		return owner;
	}
	@Override
	public String toString() {
		return "[IBANN=" + IBANN + "]";
	}
}
