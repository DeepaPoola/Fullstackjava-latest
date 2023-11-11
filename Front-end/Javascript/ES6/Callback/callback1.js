let sum=(a,b)=>{
    return a+b
}
let multi=(a,b)=>{
    return a*b
}
let calculate=(a,b, callback)=>{
  return callback(a,b)
}

let res=calculate(10,20,sum)
console.log(res)
let res1=calculate(10,20,multi)
console.log(res1)

