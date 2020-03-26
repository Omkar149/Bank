package Bank;

public class Loan extends Account{
	private int loanid;
	private int cibil;

	
	/*public Loan(int loanid, int cibil, int year, double interest, int amount) {
		super();
		this.loanid = loanid;
		this.cibil = cibil;
		this.year = year;
		this.interest = interest;
		this.amount = amount;
	}
	*/
	public int getLoanid() {
		return loanid;
	}
	public int getCibil() {
		return cibil;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public void setCibil(int cibil) {
		this.cibil = cibil;
	}
	

	@Override
	public String toString() {
		return getAccno()+"\t"+getCustname()+"\t"+getBalance()+"\t"+getPan()+"\t" 
				+ getLoanid() + "\t" + getCibil();
	}

	

}
