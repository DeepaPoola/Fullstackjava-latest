class Bank{
  constructor(hno,city,area){
      this.hno=hno;
      this.city=city;
      this.area=area;
  }
}
class Savings{
    
   constructor(id,name,salary,bank){
       this.id=id;
       this.name=name;
       this.salary=salary;
       this.bank=bank;
   }
}
let s = new Savings(10,"Sunny",30000,new Bank(20,"Deepa","Guntur"))
console.log(s)