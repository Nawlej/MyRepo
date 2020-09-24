package bankapp;

public class Account {
	private String name;
	private int cash;
	
	//get and set account name
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	//get and set account cash amount
	public int getcash() {
		return cash;
	}
	public void setcash(int cash) {
		this.cash = cash;
	}
	
}
