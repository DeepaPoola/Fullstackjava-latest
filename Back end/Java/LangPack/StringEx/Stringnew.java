public class Stringnew {
    public static void main(String[] args) {
        String name=new String("Rahul");
        String ename=new String("Rahul");
        System.out.println(name.equals(ename));//true - checks content
        System.out.println(name == ename);//false - checks refernce
    }
    }
