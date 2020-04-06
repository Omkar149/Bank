package Bank;

public class Account {

	private int accno;
	private String custname;
	private double balance;
	private String Pan;

	
	public int getAccno() {
		return accno;
	}
	public String getCustname() {
		return custname;
	}
	public double getBalance() {
		return balance;
	}
	public String getPan() {
		return Pan;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setPan(String pan) {
		Pan = pan;
	}
	@Override
	public String toString() {
		return getAccno()+"\t"+getCustname()+"\t"+getBalance()+"\t"+getPan();
	}


	
}
