class Bank{
    constructor(address){
        this.address=address;
        
    }
  }
  class Savings extends Bank{
     constructor(id,name,salary,address){
         super(address)
         this.id=id;
         this.name=name;
         this.salary=salary;
        
         
     }
  }
  let s = new Savings(10,"Sunny",30000,"Guntur")
  console.log(s)