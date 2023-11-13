public class Three extends Two{
    private int min_Bal;
    public int getMin_Bal(){
        return min_Bal;
    }
    public void setMin_Bal(int i)
    {
        this.min_Bal=i;
    }
    public void cal_Bal(){
      double bal=getSalary();
      bal=bal-getMin_Bal();
      System.out.println("Account Holder Name :"+ getName()+ " Available Balance is: " + bal);
    }
}