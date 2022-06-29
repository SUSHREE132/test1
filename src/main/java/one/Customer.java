package one;

public class Customer {
	
	private int customerId;
	
	private int customerName;
	
	private long customerContact;
	
	private String customerAdress;
	
	public Customer ()
	{
		System.out.println(this.getClass().getSimpleName()+"object is created");
		
	}
	

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public void setCustomerName(int customerName) {
		this.customerName = customerName;
	}


	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}



	public void setCustomerAdress(String customerAdress) {
		this.customerAdress = customerAdress;
	}



	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", customerAdress=" + customerAdress + "]";
	}

	

	

}
