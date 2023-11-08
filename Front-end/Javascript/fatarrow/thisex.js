/*function greet() {
    console.log(this);//it gives whole object info
}
greet()*/ 
let greet = () => {
    console.log(this)
}
greet(); //empty 