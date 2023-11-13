public class Two extends One{
	private int id;
    private String name;
    private int salary;
    
    public int getId(){
        return id;
    }
    public void setId(int a)
    {
        this.id=a;
    }
    public String getName(){
       return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int b){
        this.salary=b;
    }
    public void cal_Bal(){
        System.out.println("Two child class cal_Bal() method");
    }

}