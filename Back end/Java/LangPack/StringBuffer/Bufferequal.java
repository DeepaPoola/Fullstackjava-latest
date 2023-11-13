class Bufferequal{
    public static void main(String args[])
    {
        Bufferequal b1=new Bufferequal();
        Bufferequal b2=new Bufferequal();
        System.out.println(b1.equals(b2));//false
        StringBuffer s1=new StringBuffer("Sunny");
        StringBuffer s2=new StringBuffer("Sunny");
        StringBuffer s3=s1;
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s3));//true
        System.out.println(s1==s2);//false
    }
}