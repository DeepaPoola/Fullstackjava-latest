public class Sbi_Bank extends Bank {
	Sbi_Bank(){
		super();
		System.out.println("Child Class Construtor");
	}
	double min_Bal = 700.00;
	public void getMinBal() {
		System.out.println(super.min_Bal);
        System.out.println(min_Bal);
	}
	public void cal_Bal() {
		super.cal_Bal();
        System.out.println("Sbi banl cal_Bal() method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbi_Bank c1  = new Sbi_Bank();  //child class methods
		c1.getMinBal();
		c1.cal_Bal();
		
		
		//Bank c2 = new Bank();    // parent class methods
		//c2.cal_Bal();
	}

}
