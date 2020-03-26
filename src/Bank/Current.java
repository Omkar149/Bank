package Bank;

public class Current extends Account{
	private String companyname;
	private String gstNo;
/*
		public Current(int accno, String custname, int balance, String companyname, String gstNo) {
		super();
		this.companyname = companyname;
		this.gstNo = gstNo;
	}
*/
	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	@Override
	public String toString() {
		 return getAccno()+"\t"+getCustname()+"\t"+getBalance()+"\t"+getPan()+"\t"
				 + getCompanyname()+"\t"+getGstNo();
	}
	

}
