class Bank{
    balance=500;
    get(){
        console.log("Hello")
    }
}
class Savings extends Bank{
  account(){
      //super.balance;
      super.get();
  }
  get(){
      console.log("world")
  }

}
let c = new Savings()
c.account();
c.get()
console.log(c.balance)