class Bank{
    constructor(){

    }
}
class savings_Account extends Bank{
 
 constructor(id,name){
     super();
   this.id = id;
   this.name = name;
 }
}
let a = new savings_Account(10,"sunny")
console.log(a)