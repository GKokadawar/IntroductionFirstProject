package EncapsulationDemo;

public class Account {

	private int accno;
	private String name;
	private double amount;

	void Setdata(int eAccno, String eName, double eAmount) {
		accno = eAccno;
		name = eName;
		amount = eAmount;

	}

	void getdata() {
		System.out.println(accno + name + amount);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac=new Account();
		ac.accno=101;
		ac.name=" girish ";
		ac.amount=1000.50;
		ac.getdata();

	}

}
