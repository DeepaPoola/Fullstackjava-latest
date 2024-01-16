import React,{useState} from 'react'

const Counter = () => {
    let [count,setCount]=useState(0)
    let incrHandler=()=>{
        setCount(count+1)
    }
    let decrHandler=()=>{
        setCount(count-1)
    }
  return (
    <>
             <div className="box">
             <h3>Count:{count}</h3>
         <button onClick={incrHandler} className='button'>INCR</button>
         <button onClick={decrHandler}>DECR</button>
             </div>  
    </>
  )
}

export default Counter