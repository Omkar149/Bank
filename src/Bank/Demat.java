package Bank;

public class Demat extends Account{
	private int shareid;
	private String sharename;
	private int sharesprice;

	public String getSharename() {
		return sharename;
	}

	public int getSharesprice() {
		return sharesprice;
	}

	public void setSharename(String sharename) {
		this.sharename = sharename;
	}

	public void setSharesprice(int sharesprice) {
		this.sharesprice = sharesprice;
	}
	

	public int getShareid() {
		return shareid;
	}

	public void setShareid(int shareid) {
		this.shareid = shareid;
	}

	@Override
	public String toString() {
		return getAccno()+"\t"+getCustname()+"\t"+getBalance()+"\t"+getPan()+"\t" 
				+ getShareid()+"\t"+ getSharename()+"\t"+getSharesprice() ;
	}
	

}
