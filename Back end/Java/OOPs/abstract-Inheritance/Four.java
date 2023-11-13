public class Four extends Two {
	private int min_Bal;

	public int getMin_Bal() {
		return min_Bal;
	}
	
	public void setMin_Bal(int min_Bal) {
		this.min_Bal = min_Bal;
	}
    public void cal_Bal() {
    	double bal = getSalary(); //5000
    	bal = bal - getMin_Bal();  // 5000 - 500  = 4500.00
    	System.out.println("Account Holder Name :"+ getName()+ " Available Balance is: " + bal);
    }
}



