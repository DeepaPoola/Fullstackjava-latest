class Wrapper2 {
  public static void main(String[] args) {
            //Integer i = new Integer(10);//it gives error
            //int a  = i.intValue(); 
             //int a = i; //unboxing
           // System.out.println(a);
            
            String s = "10000";
            int value = Integer.parseInt(s);
            Float f1 = Float.parseFloat(s);
            System.out.println(f1);
            System.out.println(value);
    
        }
    
}
