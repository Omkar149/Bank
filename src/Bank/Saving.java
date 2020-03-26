package Bank;

public class Saving extends Account{
	private int amtlimit;
	private int tlimit;

	/*
	public Saving(int accno, String custname, int balance, int amtlimit, int tlimit) {
		super();
		this.amtlimit = amtlimit;
		this.tlimit = tlimit;
	}
	*/
	public int getAmtlimit() {
		return amtlimit;
	}
	public int getTlimit() {
		return tlimit;
	}
	public void setAmtlimit(int amtlimit) {
		this.amtlimit = amtlimit;
	}
	public void setTlimit(int tlimit) {
		this.tlimit = tlimit;
	}
	@Override
	public String toString() {
		return getAccno()+"\t"+getCustname()+"\t"+getBalance()+"\t"+getPan()+"\t"
				+getAmtlimit()+"\t"+ getTlimit();
	}

	
	

}
