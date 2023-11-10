 class Local {
    public void m1(){
        int a=10;
        System.out.println(a);
    }
    public static void main(String args[])
    {
       Local l=new Local();
       l.m1();
      
    }
}

//we cannot access local variable outside the method
//scope of local variable within the method