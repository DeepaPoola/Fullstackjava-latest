class Stringconcat {
     public static void main(String[] args) {
            String name =new String("Rahul");
            name.concat("Gandhi");//it doesnt concat because no refernce variable is there
            name=name.concat("PM");
            System.out.println(name);
        }
}
