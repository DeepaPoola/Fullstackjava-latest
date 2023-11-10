class Bank{
    constructor(){
        console.log("Parent")
    }
}
class savings_Account extends Bank{
 constructor(){
    super()
     console.log("child")
     
 }
}
let c = new savings_Account()