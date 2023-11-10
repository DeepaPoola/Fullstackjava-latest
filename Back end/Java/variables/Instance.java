 class Instance {
    int a=10;
    public static void main(String args[])
    {
      Instance i=new Instance();
      Instance i1=new Instance();
      i.a=20;
      System.out.println(i.a);
      System.out.println(i1.a);
    }
}

//to access instance variable using object