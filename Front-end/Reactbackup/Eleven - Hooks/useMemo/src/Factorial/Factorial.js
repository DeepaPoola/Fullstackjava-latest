import React,{useState} from 'react'
0
let Factorial =()=>{
    let [count,setCount]=useState(0)
    let [number,setNumber]=useState(5)

    const fact=(num)=>{
      let result=1
      for(let i=num;i>=1;i--)
      {
        result=result*i
      }
      console.log("factorial:",result)
      return result
    }
    let resultValue=React.useMemo(()=>{return fact(number)},[number])
    //  let resultValue=React.useMemo(()=>{return fact(number)})
    return <div>
        <h1>count:{count}</h1>
        <h1>Number:{number}</h1>
        <button onClick={()=>{
            setCount(count+1)
        }}>counter</button>
        <button onClick={()=>{
            setNumber(number+1)
        }}>Incr number</button>
    </div>
    }

    export default Factorial
