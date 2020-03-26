package Bank;

public class HomeLoan extends Loan {
/*
	public HomeLoan(int loanid, int cibil, int year, double interest, int amount) {
		super(loanid, cibil, year, interest, amount);
		// TODO Auto-generated constructor stub
	}
	*/
	private double area;
	private int year;
	private double interest;
	private int amount;
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
		
	}
	
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return getAccno()+"\t"+getCustname()+"\t"+getBalance()+"\t"+getPan()+"\t" 
				+ getLoanid() + "\t" + getCibil()+"\t"
				+getAmount()+"\t"+getYear()+"\t"+getInterest()+"\t"+getArea();
	}
	
	
	
}
