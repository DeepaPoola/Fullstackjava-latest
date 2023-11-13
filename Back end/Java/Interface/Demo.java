interface Task{
    public abstract	void doTask();
        void getTask();
    }
class Demo implements Task{
    public void doTask(){
    System.out.println("doTask()");
    }
    public void getTask(){
    System.out.println("getTask()");
    }
    public static void main(String[] args){
        Demo t1 = new Demo();
        t1.doTask();
        t1.getTask();
    }
    }
//execute by child class name