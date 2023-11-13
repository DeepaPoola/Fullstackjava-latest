public class Account1{
    int acc_id;
    String acc_Name;
    Account1(int a, String b){
        this.acc_id =a;
        this.acc_Name=b;
    //System.out.println(a+b);
    }
    
    public static void main(String[] args){
        
    Account1 a1 = new Account1(101,"Rahul");

    Account1 a2 = new Account1(102,"Sonia");
    System.out.println(a1.acc_id);
    System.out.println(a2.acc_id);
    
    }
}
