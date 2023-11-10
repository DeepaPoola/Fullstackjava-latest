class Continue1 {
    public static void main(String args[])
    {
        int a[]={10,20,30,40,50};
        for(int i=0;i<a.length;i++)
        {
            if(i==2){
             
              continue;
            }
             System.out.println(a[i]);
        }
    }
}
