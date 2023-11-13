public class Bank{
    //variable and methods
        int acc_Id = 101;
        public String acc_Name = "Rahul Gandhi";
        private double acc_Bal = 50000.00;
        protected int salary=5000;
    
        public void cal_Bal(){
        System.out.println("cal Account Balance method");	
        }
        public static void acc_Service(){
        System.out.println("Acc Service  method");
        }
        public static void main(String[] args){
            Bank a1=new Bank();
            a1.cal_Bal();
            a1.acc_Service();
            Bank.acc_Service();
            acc_Service();//static method so we can call directly or using object or using class name
            System.out.println(a1.acc_Id);
            System.out.println(a1.acc_Name);
            System.out.println(a1.acc_Bal);
            System.out.println(a1.salary);
            }
    }