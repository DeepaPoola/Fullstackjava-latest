/*let a = [10,20,30,40]
a.map((s)=>{
    x = s+10;
    return x;
})
console.log(x)//it returns only last value because we didnt give reference*/
let a = [10,20,30,40]
let b=a.map((s)=>{
    x=s+10;
    return x;
    //return s+1
})
console.log(b)