package Bank;

public class CarLoan extends Loan{
	
	
	private String carType;
	private int year;
	private double interest;
	private int amount;


	public String getCarType() {
		return carType;
	}


	public void setCarType(String carType) {
		this.carType = carType;
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
				+getYear()+"\t"+getInterest()+"\t"+getAmount()+"\t"+getCarType();
	}



	

}
