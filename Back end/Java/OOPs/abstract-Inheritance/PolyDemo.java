public class PolyDemo{
    public static void main(String args[])
    {
        Three a1=new Three();
        a1.setId(10);
        a1.setName("Sunny");
        a1.setSalary(1000);
        a1.setMin_Bal(500);
        /*System.out.println("Id:"+a1.getId()+"Name:"+a1.getName()+"Salary:"+a1.getSalary());
        a1.cal_Bal();*/

        Four a2=new Four();
        a2.setId(20);
        a2.setName("Deepa");
        a2.setSalary(2000);
        a2.setMin_Bal(1000);
        /*System.out.println("Id:"+a2.getId()+"Name:"+a2.getName()+"Salary:"+a2.getSalary());
        a2.cal_Bal();*/
        AccountService.showDetails(a1);
	    AccountService.showDetails(a2);
    }
}