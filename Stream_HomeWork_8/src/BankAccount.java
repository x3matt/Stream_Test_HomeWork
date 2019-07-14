
public class BankAccount {

	String IBANN;

	public BankAccount(String iBANN) {
		IBANN = iBANN;
	}
	public String getIBANN() {
		return IBANN;
	}
	@Override
	public String toString() {
		return "[IBANN=" + IBANN + "]";
	}
	
}
